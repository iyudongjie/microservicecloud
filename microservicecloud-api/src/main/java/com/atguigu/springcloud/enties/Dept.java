package com.atguigu.springcloud.enties;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Author: yudongjie
 * @CreateDate: 2019-11-09 18:21
 */
@Data
@Accessors(chain = true)
@NoArgsConstructor
public class Dept implements Serializable {
    private Long  deptno;   //主键
    private String  dname;   //部门名称
    private String  db_source;//来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库


    public static void main(String[] args){
        Dept dept = new Dept();
        dept.setDeptno(11L).setDb_source("111").setDname("12");
    }
}
