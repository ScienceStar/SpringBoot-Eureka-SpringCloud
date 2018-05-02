package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Create by mac on 2018/5/1
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ApplicationControl {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationControl.class,args);
    }
}
