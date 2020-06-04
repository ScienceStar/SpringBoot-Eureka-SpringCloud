package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Create by mac on 2018/5/1
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableEurekaServer
@EnableJpaRepositories
@ComponentScan(value = "com")
public class ApplicationControl {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationControl.class, args);
    }
}
