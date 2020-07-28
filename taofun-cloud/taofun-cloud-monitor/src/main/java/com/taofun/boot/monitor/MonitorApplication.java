package com.taofun.boot.monitor;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName : MonitorApplication  //类名
 * @Description :   //描述
 * @Author : HTB  //作者
 * @Date: 2020-07-28 00:34  //时间
 */
@EnableAdminServer
@SpringBootApplication
public class MonitorApplication {
    public static void main(String[] args)
    {
        SpringApplication.run(MonitorApplication.class, args);
    }
}
