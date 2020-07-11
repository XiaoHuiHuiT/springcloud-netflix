package com.jonathanlee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * description: GoodsApplication
 * date: 2020-07-11 10:29
 * author: 30315
 * version: 1.0
 */
@EnableEurekaClient
@SpringBootApplication
public class Goods2Application {

    public static void main(String[] args) {
        SpringApplication.run(Goods2Application.class, args);
    }

}