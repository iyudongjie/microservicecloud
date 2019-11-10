package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author: yudongjie
 * @CreateDate: 2019-11-09 22:34
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.atguigu.springcloud"})
@ComponentScan("com.atguigu.springcloud")
public class DeptConsumer9000_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer9000_App.class, args);
    }

}
