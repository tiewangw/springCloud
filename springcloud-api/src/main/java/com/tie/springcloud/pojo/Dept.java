package com.tie.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.zip.CheckedInputStream;


@Data
@NoArgsConstructor
@Accessors(chain = true) //链式写法
public class Dept implements Serializable { //微服务实体类必须实现序列化

    private Long deptno;//主键

    private String dname;

    //这个数据存在哪个数据库--微服务 ，一个服务对应一个数据库，同一个信息可能存在不同的数据库中
    private String db_source;

    public Dept(String dname) {
        this.dname = dname;
    }
}
