package com.jeff.ioc.userMod.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoMyBatisImpl implements UserDao{
    @Override
    public void addUser() {
        System.out.println("UserDaoMyBatisImpl: add success");
    }
}
