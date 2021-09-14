package com.mountslink.hello.controller;

import com.mountslink.hello.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lu'xing
 * @title: HelloController
 * @projectName hello-world
 * @description: TODO
 * @date 2021/9/1314:39
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/sayHello")
    public String sayHello(){
        return "hello";
    }

    @GetMapping("/getUserById")
    public String getUserById(@RequestParam String id){
        String userById = helloService.getUserById(id);
        return userById;
    }

}
