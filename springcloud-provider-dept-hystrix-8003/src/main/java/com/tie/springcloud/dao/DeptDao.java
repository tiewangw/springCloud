package com.tie.springcloud.dao;

import com.tie.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DeptDao {

    public List<Dept> queryAll();

    public Dept queryDeptById(Long id);

    public boolean addDept(Dept dept);

}
