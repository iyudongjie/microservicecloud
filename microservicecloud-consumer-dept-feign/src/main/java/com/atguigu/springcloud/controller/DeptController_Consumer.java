package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.enties.Dept;
import com.atguigu.springcloud.service.DeptClientService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: yudongjie
 * @CreateDate: 2019-11-09 22:33
 */
@RestController
@RequestMapping("/consumer")
public class DeptController_Consumer {

    @Resource
    private DeptClientService deptClientService;
    @RequestMapping(value = "/dept/add")
    public boolean add(Dept dept) {
        return deptClientService.add(dept);
    }

    @RequestMapping(value = "/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return deptClientService.get(id);
    }

    @SuppressWarnings("unchecked")
    @RequestMapping(value = "/dept/list")
    public List<Dept> list() {
        return deptClientService.list();
    }

}