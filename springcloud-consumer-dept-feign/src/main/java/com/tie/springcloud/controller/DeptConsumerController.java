package com.tie.springcloud.controller;

import com.tie.springcloud.pojo.Dept;
import com.tie.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptConsumerController{

    @Autowired
    private RestTemplate restTemplate;
    /**
     * 注入fegin实现的deptService
     */

    @Autowired
    private DeptClientService deptClientService;  //ideal校验报错不影响工程

    @RequestMapping("/consumer/dept/list") //http://localhost/consumer/dept/list
    public List<Dept> queryAll() {
        return deptClientService.queryAll();
    }



    @RequestMapping("/consumer/dept/get/{id}")
    public Dept getDeptById(@PathVariable("id") Long id) {
        return deptClientService.queryDeptById(id);
    }


    @RequestMapping("/consumer/dept/postadd")
    public Boolean addDeptPost(Dept dept) {
        return deptClientService.addDept(dept);
    }


}
