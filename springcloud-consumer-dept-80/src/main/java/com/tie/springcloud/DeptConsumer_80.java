package com.tie.springcloud;

import com.tie.myRibbonRule.myRibbonRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient  //Ribbon 和 Eureka整合后，客户端可以直接调用，不需要关心IP地址
//在微服务加载的时候自动添加 我们自定义的Ribbon类  （可以不写，默认的是轮询）
@RibbonClient(name = "SPRINGCLOUD-PROVIDER-DEPT",configuration = myRibbonRule.class)
public class DeptConsumer_80 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_80.class,args);
    }
}
