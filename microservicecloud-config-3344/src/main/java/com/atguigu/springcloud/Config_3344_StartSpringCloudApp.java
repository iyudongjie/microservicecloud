package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Author: yudongjie
 * @CreateDate: 2019-11-11 20:36
 */
@SpringBootApplication
@EnableConfigServer
public class Config_3344_StartSpringCloudApp {
    public static void main(String[] args){
        SpringApplication.run(Config_3344_StartSpringCloudApp.class, args);

    }
}
