package com.jonathanlee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class eureka3001Application {

    public static void main(String[] args) {
        SpringApplication.run(eureka3001Application.class, args);
    }

}