package com.zdk.hellospringcloudwebadminribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HelloSpringCloudWebAdminRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloSpringCloudWebAdminRibbonApplication.class, args);
    }

}
