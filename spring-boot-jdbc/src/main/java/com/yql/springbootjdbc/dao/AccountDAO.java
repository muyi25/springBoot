package com.yql.springbootjdbc.dao;


import com.yql.springbootjdbc.po.Account;

import java.util.List;

/**
 *
 */
public interface AccountDAO {
    int add(Account account);

    int update(Account account);

    int delete(int id);

    Account findAccountById(int id);

    List<Account> findAccountList();
}
