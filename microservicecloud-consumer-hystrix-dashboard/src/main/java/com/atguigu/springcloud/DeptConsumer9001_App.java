package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Author: yudongjie
 * @CreateDate: 2019-11-10 22:13
 */
@SpringBootApplication
@EnableHystrixDashboard
public class DeptConsumer9001_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer9001_App.class, args);

    }

}
