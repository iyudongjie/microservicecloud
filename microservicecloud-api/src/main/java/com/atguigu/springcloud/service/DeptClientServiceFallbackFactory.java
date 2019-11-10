package com.atguigu.springcloud.service;

import com.atguigu.springcloud.enties.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author: yudongjie
 * @CreateDate: 2019-11-10 21:23
 */
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public Dept get(long id) {
                return new Dept().setDname("该id is null").setDb_source("数据库找不到");
            }

            @Override
            public List list() {
                return null;
            }

            @Override
            public boolean add(Dept dept) {
                return false;
            }
        };
    }
}
