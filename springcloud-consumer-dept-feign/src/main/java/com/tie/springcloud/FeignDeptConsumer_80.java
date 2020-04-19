package com.tie.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient  //Ribbon 和 Eureka整合后，客户端可以直接调用，不需要关心IP地址
//在微服务加载的时候自动添加 我们自定义的Ribbon类  （可以不写，默认的是轮询）
//@RibbonClient(name = "SPRINGCLOUD-PROVIDER-DEPT",configuration = myRibbonRule.class)
@EnableFeignClients(basePackages = {"com.tie.springcloud"})
//@ComponentScan("com.tie") 如果和上面相同就不需要
public class FeignDeptConsumer_80 {
    public static void main(String[] args) {
        SpringApplication.run(FeignDeptConsumer_80.class,args);
    }
}
