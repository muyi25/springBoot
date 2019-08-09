package com.yql.springbootmybatis.dao;

import org.apache.ibatis.annotations.Param;

/**
 *
 */
public interface AccountMapper {
    int update(@Param("money") double money, @Param("id") int id);
}
