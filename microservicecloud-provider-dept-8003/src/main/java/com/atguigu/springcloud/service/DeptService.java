package com.atguigu.springcloud.service;

import com.atguigu.springcloud.enties.Dept;

import java.util.List;

/**
 * @Author: yudongjie
 * @CreateDate: 2019-11-09 21:46
 */
public interface DeptService {
        public boolean add(Dept dept);
        public Dept get(Long id);
        public List<Dept> list();

}
