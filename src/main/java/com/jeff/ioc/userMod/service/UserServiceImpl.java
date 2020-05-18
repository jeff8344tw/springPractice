package com.jeff.ioc.userMod.service;

import com.jeff.ioc.userMod.dao.UserDao;
import com.jeff.ioc.userMod.dao.UserDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    @Qualifier(value="userDaoMyBatisImpl")
    private UserDao userDao;

//    @Autowired
//    @Qualifier(value="userDaoMyBatisImpl")
//    public void setUserDao(UserDao userDao){
//        this.userDao = userDao;
//    }

    public UserServiceImpl() {
        System.out.println("UserServiceImpl init");
    }

    @Override
    public void addUser() {
        userDao.addUser();
    }
}
