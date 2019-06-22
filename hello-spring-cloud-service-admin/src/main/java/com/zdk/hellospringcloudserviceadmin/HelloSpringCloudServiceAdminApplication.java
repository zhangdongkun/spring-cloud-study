package com.zdk.hellospringcloudserviceadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan("com.zdk")
public class HelloSpringCloudServiceAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloSpringCloudServiceAdminApplication.class, args);
    }

}