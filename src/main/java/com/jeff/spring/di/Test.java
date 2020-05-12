package com.jeff.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans-di.xml");
        Student student = ac.getBean("s1", Student.class);
        Student student2 = ac.getBean("s2", Student.class);
        Student student3 = ac.getBean("s3", Student.class);
        System.out.println(student);
        System.out.println(student2);
        System.out.println(student3);
    }
}
