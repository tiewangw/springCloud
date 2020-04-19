package com.tie.springcloud.service;

import com.tie.springcloud.pojo.Dept;

import java.util.List;


public interface DeptService {
    public List<Dept> queryAll();

    public Dept queryDeptById(Long id);

    public boolean addDept(Dept dept);
}
