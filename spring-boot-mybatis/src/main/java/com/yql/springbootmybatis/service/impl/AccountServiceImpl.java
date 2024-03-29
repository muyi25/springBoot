package com.yql.springbootmybatis.service.impl;


import com.yql.springbootmybatis.dao.AccountMapper;
import com.yql.springbootmybatis.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountMapper accountMapper;

    @Transactional//开启事务注解
    public void transfer() throws RuntimeException{
        accountMapper.update(90.0,1);//用户1减10块 用户2加10块
       // int i=1/0;
        accountMapper.update(110.0,2);
    }


}
