package com.jonathanlee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class eureka3000Application {

    public static void main(String[] args) {
        SpringApplication.run(eureka3000Application.class, args);
    }

}