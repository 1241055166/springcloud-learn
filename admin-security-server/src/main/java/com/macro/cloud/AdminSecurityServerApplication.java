package com.macro.cloud;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@EnableAdminServer  //开启AdminServer及注册发现功能
@SpringBootApplication
public class AdminSecurityServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminSecurityServerApplication.class, args);
    }

}
