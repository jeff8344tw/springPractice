package com.jeff.ioc.userMod.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements  UserDao {
    public UserDaoImpl() {
        System.out.println("UserDaoImpl init");
    }

    @Override
    public void addUser() {
        System.out.println("UserDaoImpl: " +
                "add success");
    }
}
