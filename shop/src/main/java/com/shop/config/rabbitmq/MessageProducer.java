package com.shop.config.rabbitmq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * 生产者 发送消息
 */

@Slf4j
@Component
public class MessageProducer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    //confirmCallback 回调
    RabbitTemplate.ConfirmCallback confirmCallback = new RabbitTemplate.ConfirmCallback() {
        /**
         *
         * @param correlationData 自定义id
         * @param isAck  消息是否被Broker接收，isAck(true接收,false拒收)，
         * @param s  如果拒收，则返回拒收的原因
         */
        @Override
        public void confirm(CorrelationData correlationData, boolean isAck, String s) {
            log.info("======》id: " + correlationData);
            log.info("======》是否应答: " + isAck);
            if(!isAck){
                log.info("======》s: "+s);
            }
        }
    };


    //创建一个处理消息是否被队列接收的监听对象，如果没有队列接收发出的消息，则会自动调用returnedMessage方法，进行后续的处理
    RabbitTemplate.ReturnCallback returnCallback = new RabbitTemplate.ReturnCallback() {
        /**
         *
         * @param message 被退回的消息
         * @param replyCode 错误编码
         * @param replyText  错误描述
         * @param exchangeName 交换机的名字
         * @param routingKey  路由Key
         */
        @Override
        public void returnedMessage(Message message, int replyCode, String replyText, String exchangeName, String routingKey) {
            log.info("----- id: " + replyCode +",  Text: " + replyText);
            log.info("-----交换机名称: " + exchangeName +",  routingKey: " + routingKey);
            log.info("-----退回消息: " + message);
        }
    };

    /**
     * 发送消息
     * @param content
     * @param <T>
     */
    public <T> void sendMessage(T content){
        //CorrelationData 自定义id
        CorrelationData correlationData = new CorrelationData(UUID.randomUUID().toString());

        //设置消息是否投递成功的监听对象
        rabbitTemplate.setConfirmCallback(confirmCallback);

        //设置消息是否被队列成功接收的监听对象
        rabbitTemplate.setReturnCallback(returnCallback);

        rabbitTemplate.convertAndSend("test", "test", content, correlationData);
    }
}
