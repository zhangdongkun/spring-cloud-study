package com.zdk.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @description rest 的配置类
 * @author: zhangDongkun
 * @date: 2019-06-22 16:59
 **/
@Configuration
public class RestTemplateConfiguration {
   @Bean
   @LoadBalanced
   //需要提供bean 的实例化逻辑
    public RestTemplate restTemplate(){
        return  new RestTemplate();
    }
}
