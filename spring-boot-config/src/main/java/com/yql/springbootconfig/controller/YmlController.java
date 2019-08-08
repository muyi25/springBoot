package com.yql.springbootconfig.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class YmlController {

    @Value("${my.name}")
    private String name;

    @Value("${my.age}")
    private int age;

    @Value("${my.sex}")
    private String sex;

    @RequestMapping(value = "/yml")
    public String yal() {
        return name + ":" + age + ":" + sex;
    }
}
