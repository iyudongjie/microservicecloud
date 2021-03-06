package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.enties.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: yudongjie
 * @CreateDate: 2019-11-09 21:33
 */
@Mapper
public interface DeptDao {
    public boolean addDept(Dept dept);
    public Dept findById(Long id);
    public List<Dept> findAll();
}
