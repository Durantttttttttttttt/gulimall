package com.yang.gulimall.vencher;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.yang.gulimall.vencher.dao")
@EnableDiscoveryClient
public class GulimallVencherApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallVencherApplication.class, args);
    }

}
