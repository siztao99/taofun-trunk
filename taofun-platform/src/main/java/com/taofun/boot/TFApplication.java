package com.taofun.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ClassName : TFApplication  //类名
 * @Description :   //描述
 * @Author : HTB  //作者
 * @Date: 2020-07-26 15:59  //时间
 */
@SpringBootApplication
@MapperScan("com.taofun.boot.platform")
public class TFApplication {
    public static void main(String[] args) {
        new SpringApplication(TFApplication.class).run(args);
    }
}
