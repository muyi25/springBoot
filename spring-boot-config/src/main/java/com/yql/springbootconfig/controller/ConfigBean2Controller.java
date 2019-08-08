package com.yql.springbootconfig.controller;

import com.yql.springbootconfig.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigBean2Controller {

    @Autowired
    User user;

    @RequestMapping(value = "/user")
    public String user(){
        return user.getName()+":"+user.getAge();
    }
}
