package com.tie.springcloud.service;

import com.tie.springcloud.dao.DeptDao;
import com.tie.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao deptDao;

    public List<Dept> queryAll() {
        return deptDao.queryAll();
    }

    public Dept queryDeptById(Long id) {
        return deptDao.queryDeptById(id);
    }

    public boolean addDept(Dept dept) {
        return deptDao.addDept(dept);
    }
}
