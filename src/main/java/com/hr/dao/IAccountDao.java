package com.hr.dao;

import com.hr.domain.Account;
import com.hr.domain.User;

import java.util.List;


public interface IAccountDao {

    /**
     * 查询所有账户,同时还要获取到当前账户的所属用户信息
     * (订单和账户, 是多对一的关系, mybatis中使用一对一来处理)
     * @return
     */
    List<Account> findAll();

}
