package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Create by mac on 2018/5/1
 */
@EnableCircuitBreaker
@EnableDiscoveryClient
@SpringBootApplication
public class Ribbon_Starter {
    public static void main(String[] args) {
        SpringApplication.run(Ribbon_Starter.class,args);
    }
}
