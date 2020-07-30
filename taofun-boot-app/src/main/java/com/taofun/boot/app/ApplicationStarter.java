package com.taofun.boot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@tk.mybatis.spring.annotation.MapperScan("com.taofun.boot.app.mapper")
public class ApplicationStarter {
    public static void main(String[] args) {
        new SpringApplication(ApplicationStarter.class).run(args);
    }
}
