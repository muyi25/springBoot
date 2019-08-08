package com.yql.springbootconfig.controller;

import com.yql.springbootconfig.po.MyConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigBeanController {

    @Autowired
    MyConfigBean configBean;

    @RequestMapping(value = "/configBean")
    public String configBean(){
        return configBean.getName()+" :"+configBean.getAge()+" :"+ configBean.getUuid();
    }
}
