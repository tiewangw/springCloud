package com.tie.springcloud.controller;

import com.tie.springcloud.pojo.Dept;
import com.tie.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptConsumerController{

    /**
     *消费者不应该有service层 ，应该直接调用服务
     * 方法：RestTemplate 注入到spring的bean中（见config中的ConfigBean ） ，供我们直接调用
     *   RestTemplate ：提供多种便捷访问远程http服务的方法，简单的Restful服务模板
     *    注意：   restTemplate.getForObject 和 restTemplate.getForEntity
     */
    @Autowired
    private RestTemplate restTemplate;

    /**
     * 注入fegin实现的deptService
     */
    @Autowired
    private DeptService deptService;

    @RequestMapping("/consumer/dept/list") //http://localhost/consumer/dept/list
    public List<Dept> queryAll() {
        return deptService.queryAll();
    }

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept getDeptById(@PathVariable("id") Long id) {
        return deptService.queryDeptById(id);
    }


    @RequestMapping("/consumer/dept/postadd")
    public Boolean addDeptPost(Dept dept) {
        return deptService.addDept(dept);
    }


}
