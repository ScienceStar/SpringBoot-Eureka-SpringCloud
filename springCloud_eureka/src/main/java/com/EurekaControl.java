package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Create by mac on 2018/4/29
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaControl {
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication();
        springApplication.run(EurekaControl.class,args);
    }
}
