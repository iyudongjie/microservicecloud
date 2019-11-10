package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.enties.Dept;
import com.atguigu.springcloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: yudongjie
 * @CreateDate: 2019-11-09 21:57
 */
@RestController
@RequestMapping("/dept")
public class DeptController {

    @Resource
    private DeptService deptService;
    @Resource
    private DiscoveryClient client;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept) {
        return deptService.add(dept);
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public Dept get(@PathVariable("id") Long id) {
        Dept dept = deptService.get(id);
        if(dept==null){
            throw new RuntimeException("该id:"+id+"没有对应的部门");
        }
        return deptService.get(id);
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Dept> list() {
        return deptService.list();
    }

    public Dept processHystrix_Get(@PathVariable("id") Long id){
        return new Dept().setDname("该id没有对应的"+id).setDb_source("该数据库没有相应的值");
    }

}
