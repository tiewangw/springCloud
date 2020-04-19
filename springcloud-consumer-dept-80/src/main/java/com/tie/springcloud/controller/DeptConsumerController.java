package com.tie.springcloud.controller;

import com.tie.springcloud.pojo.Dept;
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

//    private static final String REST_URI_PREFIX = "http://localhost:8001";
    //Ribbon 负载均衡需要通过服务名调用，不能把路劲写死
    private static final String REST_URI_PREFIX = "http://SPRINGCLOUD-PROVIDER-DEPT";

    @RequestMapping("/consumer/dept/list") //http://localhost/consumer/dept/list
    public List<Dept> queryAll() {
        return (List<Dept>) restTemplate.getForObject(REST_URI_PREFIX + "/dept/list", List.class);
    }

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept getDeptById(@PathVariable("id") Long id) {
        return restTemplate.getForObject(REST_URI_PREFIX + "/dept/get/" + id, Dept.class);
    }


    @RequestMapping("/consumer/dept/post/{id}")
    public Dept getDeptByIdPost(@PathVariable("id") long id) {
        return restTemplate.getForObject(REST_URI_PREFIX + "/dept/post/" + id, Dept.class, id);
    }

    @RequestMapping("/consumer/dept/getadd")
    public Boolean addDeptGet(Dept dept) {
        return restTemplate.getForObject(REST_URI_PREFIX + "dept/getadd", Boolean.class);
    }


    @RequestMapping("/consumer/dept/postadd")
    public Boolean addDeptPost(Dept dept) {
        return restTemplate.postForObject(REST_URI_PREFIX+"/dept/postadd",dept,Boolean.class);
    }


}
