package com.taofun.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringGatewayApplication {
    public static void main(String[] args) {
        new SpringApplication(SpringGatewayApplication.class).run(args);
    }
}
