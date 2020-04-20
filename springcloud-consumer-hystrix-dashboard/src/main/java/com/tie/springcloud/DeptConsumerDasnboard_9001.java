package com.tie.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard //开启dashboard监控  <!--provider中需要有 actuator完善监控信息包-->
public class DeptConsumerDasnboard_9001 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerDasnboard_9001.class,args);
    }
}
