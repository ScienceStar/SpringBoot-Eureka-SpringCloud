package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Create by mac on 2018/5/2
 */
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class Fegin_Starter {
    public static void main(String[] args) {
        SpringApplication.run(Fegin_Starter.class,args);
    }
}
