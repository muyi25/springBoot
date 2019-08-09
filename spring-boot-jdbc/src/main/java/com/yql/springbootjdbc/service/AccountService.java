package com.yql.springbootjdbc.service;


import com.yql.springbootjdbc.po.Account;

import java.util.List;


public interface AccountService {


    int add(Account account);

    int update(Account account);

    int delete(int id);

    Account findAccountById(int id);

    List<Account> findAccountList();

}
