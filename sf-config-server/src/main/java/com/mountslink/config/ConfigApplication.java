package com.mountslink.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author lu'xing
 * @title: ConfigApplicatio
 * @projectName hello-world
 * @description: TODO
 * @date 2021/9/1314:07
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(com.mountslink.config.ConfigApplication.class, args);
    }
}
