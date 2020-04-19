package com.tie.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * DeptProviderHystrix_8003 主启动类
 */
@SpringBootApplication
@EnableEurekaClient     //开启后服务自动注入eureka
@EnableDiscoveryClient  //注册发现-->获取微服务信息
@EnableCircuitBreaker   //添加Hystrix对熔断的支持
public class DeptProviderHystrix_8003 {

    public static void main(String[] args) {
        SpringApplication.run(DeptProviderHystrix_8003.class,args);
    }
}
