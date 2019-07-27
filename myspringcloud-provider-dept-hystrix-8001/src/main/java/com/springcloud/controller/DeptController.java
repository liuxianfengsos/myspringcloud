package com.springcloud.controller;

import java.util.List;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springcloud.entities.Dept;
import com.springcloud.service.DeptService;

@RestController
public class DeptController {
    @Autowired
    private DeptService service;

    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    //一旦调用服务方法失败并抛出了错误信息后，会自动调用@HystrixCommand标注好的fallbackMethod调用类中的指定方法
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public Dept get(@PathVariable("id") Long id)
    {
        return service.get(id);
    }
    public Dept processHystrix_Get(@PathVariable("id") Long id)
    {
        System.out.println("出现了熔断processHystrix_Get");
        return new Dept().setDeptno(id).setDname("该ID：" + id + "没有没有对应的信息,null--@HystrixCommand")
                .setDb_source("no this database in MySQL");
    }


    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept)
    {
        return service.add(dept);
    }
    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> list()
    {
        return service.list();
    }
}
