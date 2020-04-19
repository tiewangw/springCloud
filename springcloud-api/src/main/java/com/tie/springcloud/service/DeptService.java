package com.tie.springcloud.service;

import com.tie.springcloud.pojo.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
@FeignClient(value = "SPRINGCLOUD-PROVIDER-DEPT")
public interface DeptService {

    @GetMapping("/dept/list")
    public List<Dept> queryAll();

    @GetMapping("/dept/get/{id}")
    public Dept queryDeptById(@PathVariable("id") Long id);

    @PostMapping("dept/postadd")
    public boolean addDept(Dept dept);
}
