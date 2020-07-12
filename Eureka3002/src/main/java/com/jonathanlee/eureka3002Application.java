package com.jonathanlee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * description: eureka3002Application
 * date: 2020-07-12 10:37
 * author: 30315
 * version: 1.0
 */
@EnableEurekaServer
@SpringBootApplication
public class eureka3002Application {

    public static void main(String[] args) {
        SpringApplication.run(eureka3002Application.class, args);
    }

}