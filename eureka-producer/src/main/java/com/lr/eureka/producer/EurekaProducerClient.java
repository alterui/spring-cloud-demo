package com.lr.eureka.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 服务提供者
 *
 * @author liurui
 * @date 2020/1/1 21:00
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaProducerClient {
    public static void main(String[] args) {
        SpringApplication.run(EurekaProducerClient.class, args);
    }
}
