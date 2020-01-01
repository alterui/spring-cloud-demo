package com.lr.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka Server 启动类
 * @author liurui
 * @date 2020/1/1 18:13
 */
@SpringBootApplication //该注解的作用是声明该类是Spring Boot服务的入口
@EnableEurekaServer  //该注解的作用是声明该类是一个Eureka Server 微服务，提供注册和服务发现的作用，即注册中心。类似于dubbo中的zookeeper
public class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
