package com.mountslink.hello.service;

import com.mountslink.hello.mapper.HelloMapper;
import com.mountslink.hello.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lu'xing
 * @title: HelloService
 * @projectName hello-world
 * @description: TODO
 * @date 2021/9/1315:14
 */
@Service
public class HelloService {

    @Autowired
    private HelloMapper helloMapper;

    public String getUserById(String id){
        User userById = helloMapper.getUserById(id);
        return userById.toString();
    }

}
