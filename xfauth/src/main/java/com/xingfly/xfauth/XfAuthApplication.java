package com.xingfly.xfauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableDiscoveryClient
public class XfAuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(XfAuthApplication.class, args);
    }
}