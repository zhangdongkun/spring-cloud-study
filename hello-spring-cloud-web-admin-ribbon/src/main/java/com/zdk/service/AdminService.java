package com.zdk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @description
 * @author: zhangDongkun
 * @date: 2019-06-22 22:24
 **/

@Service
public class AdminService {
    @Autowired
    private RestTemplate restTemplate;

    public String sayHi(String message) {
        return restTemplate.getForObject("http://HELLO-SPRING-CLOUD-SERVICE-ADMIN/hello?name=" + message, String.class);
    }
}
