package com.yang.gulimall.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.yang.gulimall.user.dao")
@EnableDiscoveryClient
public class GulimallUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallUserApplication.class, args);
    }

}
