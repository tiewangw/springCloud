package com.tie.springcloud.service;

import com.tie.springcloud.pojo.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory {

    @Override
    public Object create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public List<Dept> queryAll() {
                return null;
            }

            @Override
            public Dept queryDeptById(Long id) {
                return new Dept()
                        .setDeptno(id)
                        .setDname("Hystrix 服务降级，该服务已关闭！")
                        .setDb_source(" no data");
            }

            @Override
            public boolean addDept(Dept dept) {
                return false;
            }
        };
    }
}
