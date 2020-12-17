package com.shop;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableRabbit
@SpringBootApplication(scanBasePackages = {"com.shop.aop","com.shop.common","com.shop.config",
        "com.shop.controller","com.shop.entity","com.shop.mapper","com.shop.service","com.shop.shopEnum","com.shop.vo"})
@EnableTransactionManagement
@MapperScan({"com.shop.mapper","com.baomidou.springboot.*.mapper"})
@NacosPropertySource(dataId = "gabriel", autoRefreshed = true)
public class ShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopApplication.class, args);
    }
}
