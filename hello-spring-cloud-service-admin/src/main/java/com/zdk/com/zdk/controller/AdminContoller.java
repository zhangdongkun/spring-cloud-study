package com.zdk.com.zdk.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description
 * @author: zhangDongkun
 * @date: 2019-06-22 17:20
 **/

@RestController
public class AdminContoller {
    @Value("${server.port}")
    private  String port;
    @GetMapping("/hello")
    //加了 RequestParam 不传name 会 400
    //不加 RequestParam 随便传不会报错
    public  String sayHello( String name){
        return  String.format("hello  %s,this is ------------------%s",name,port) ;


    }
}
