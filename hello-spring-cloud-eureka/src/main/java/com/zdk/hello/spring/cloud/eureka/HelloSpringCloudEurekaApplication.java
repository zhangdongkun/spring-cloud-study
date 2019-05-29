package com.zdk.hello.spring.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class HelloSpringCloudEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloSpringCloudEurekaApplication.class, args);
    }

}
