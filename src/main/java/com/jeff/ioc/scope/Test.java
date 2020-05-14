package com.jeff.ioc.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        /**
         * 若spring中有單例模式的bean，在初始化容器時就會建此對象
         * 而多例及原型的bean，會在使用時才創建
         */
        ApplicationContext ac = new ClassPathXmlApplicationContext("scope.xml");
        Student student = ac.getBean("student", Student.class);
        Student student2 = ac.getBean("student", Student.class);
        System.out.println(student);
        System.out.println(student2);
    }
}
