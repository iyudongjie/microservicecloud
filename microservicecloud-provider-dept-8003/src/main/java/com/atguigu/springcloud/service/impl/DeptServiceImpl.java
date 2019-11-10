package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.DeptDao;
import com.atguigu.springcloud.enties.Dept;
import com.atguigu.springcloud.service.DeptService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: yudongjie
 * @CreateDate: 2019-11-09 21:48
 */
@Transactional(propagation= Propagation.REQUIRED)
@Service
public class DeptServiceImpl implements DeptService {

    @Resource
    private DeptDao deptDao;
    @Override
    public boolean add(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return deptDao.findById(id);
    }

    @Override
    public List<Dept> list() {
        return deptDao.findAll();
    }
}
