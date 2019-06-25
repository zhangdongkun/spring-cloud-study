package com.zdk.action;

import com.zdk.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description
 * @author: zhangDongkun
 * @date: 2019-06-24 21:50
 **/
@RestController
public class HelloController {
    @Autowired
   private AdminService service;
       @GetMapping("/hi")
      public  String sayHi(String name){
           System.out.println("name:---->" +name);
        return this.service.sayHi(name);

      }

}
