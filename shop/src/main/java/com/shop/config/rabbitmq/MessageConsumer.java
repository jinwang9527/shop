package com.shop.config.rabbitmq;

import com.rabbitmq.client.Channel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Map;

/**
 * 消费者 接收消息
 */
@Slf4j
@Component
public class MessageConsumer {

    @Autowired
    private RabbitTemplate rabbitTemplate;


    /**
     * 用于接收消息的方法
     * @param channel
     * @param headers
     */
    @RabbitListener(
            bindings = @QueueBinding(
                    value = @Queue(value = "test", durable = "true"),
                    exchange = @Exchange(value = "test", durable = "true", type = "topic"),
                    key = "test"
            )
    )
    /**
     *  @param channel   ack应答
     *  @param headers   其余参数
     */
    @RabbitHandler
    public <T> void handleMessage(T t, Channel channel,
                              @Headers Map<String, Object> headers){

        long tag = (long) headers.get(AmqpHeaders.DELIVERY_TAG);
        log.info(t.toString());
        try {
            channel.basicAck(tag, false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
