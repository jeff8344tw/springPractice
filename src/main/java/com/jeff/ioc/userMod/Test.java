package com.jeff.ioc.userMod;

import com.jeff.ioc.userMod.controller.UserController;
import com.jeff.ioc.userMod.dao.UserDao;
import com.jeff.ioc.userMod.dao.UserDaoImpl;
import com.jeff.ioc.userMod.service.UserService;
import com.jeff.ioc.userMod.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("user.xml");
        UserController userController = ac.getBean("aaa", UserController.class);
        UserService userService = ac.getBean("userServiceImpl", UserServiceImpl.class);
        UserDao userDao = ac.getBean("userDaoImpl", UserDaoImpl.class);
        System.out.println(userController);
        System.out.println(userService);
        System.out.println(userDao);

        userController.addUser();
    }
}
