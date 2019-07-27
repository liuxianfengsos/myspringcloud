package com.springcloud.entities;

import java.io.Serializable;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
@NoArgsConstructor
@Data
@Accessors(chain=true)
public class Dept implements Serializable{
    private Long 	deptno;//主键
    private String 	dname;//部门名称
    private String 	db_source;//来自哪个数据库，微服务架构可以一个服务对应一个数据库。

    /*public static void main(String[] args) {
        Dept d = new Dept();
        d.getDb_source();
    }*/
}
