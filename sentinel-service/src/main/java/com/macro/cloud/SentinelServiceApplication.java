package com.macro.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

//启动之后，访问:  http://localhost:8080
@EnableFeignClients  //启动Feign功能
@EnableDiscoveryClient
@SpringBootApplication
public class SentinelServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SentinelServiceApplication.class, args);
    }

}
