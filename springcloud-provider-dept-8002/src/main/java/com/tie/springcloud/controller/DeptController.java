package com.tie.springcloud.controller;

import com.tie.springcloud.pojo.Dept;
import com.tie.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController {
    @Autowired
    private DeptClientService deptService;  //ideal校验报错，不影响 换成deptClientService就不报错了

    //获取一些配置的信息，获取具体的微服务
    @Autowired
    private DiscoveryClient client;

    @GetMapping("/dept/list")  //http://localhost:8001/dept/list
    public List<Dept> queryAll(){
        return deptService.queryAll();
    }

    @GetMapping("/dept/get/{id}")  // http://localhost:8001/dept/get/1
    public Dept getDeptById(@PathVariable long id){
        return deptService.queryDeptById(id);
    }

    @PostMapping("/dept/post/{id}")  // http://localhost:8001/dept/post/1
    public Dept getDeptPostById(@PathVariable long id){
        return deptService.queryDeptById(id);
    }

    @GetMapping("/dept/getadd") //  http://localhost:8001/dept/add?dname=策划部
    public boolean addDept(Dept dept){
        return deptService.addDept(dept);
    }


    @PostMapping("/dept/postadd") //
    public boolean addDeptPost(Dept dept){
        return deptService.addDept(dept);
    }

    /**
     * 获取注册进来的微服务的一些信息
     * http://localhost:8001/dept/discovery
     * @return
     */
    @GetMapping("dept/discovery")
    public Object discovery(){
        //注册到eureka的微服务清单
        List<String> services = client.getServices();
        System.out.println("discovery-->services:"+services);

        //具体的某一个微服务信息
        List<ServiceInstance> instances = client.getInstances("SPRINGCLOUD-PROVIDER-DEPT");
        for (ServiceInstance instance : instances) {
            System.out.println(
                    instance.getHost()+"\t"+
                    instance.getPort()+"\t"+
                    instance.getScheme()+"\t"+
                    instance.getServiceId()+"\t"+
                    instance.getUri()
            );
        }

        return this.client;
    }
}
