package com.tie.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration   //相当于spring中的applicationContext.xml，可以写自己的负载均衡算法
public class ConfigBean {

    /**
     *负载均衡核心 ：IRule
     *  RoundRobinRule 轮询
     *  RandomRule 随机
     *  RetryRule 重试
     * @return
     */
    @Bean
    @LoadBalanced //Ribbon
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
