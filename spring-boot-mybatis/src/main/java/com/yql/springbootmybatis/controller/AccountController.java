package com.yql.springbootmybatis.controller;


import com.yql.springbootmybatis.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountService accountService;

    @PutMapping(("/transfer"))
    public void transfer() {
        accountService.transfer();
    }
}
