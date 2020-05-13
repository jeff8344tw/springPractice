package com.jeff.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans-di.xml");
        Student student = ac.getBean("s1", Student.class);
        Student student2 = ac.getBean("s2", Student.class);
        Student student3 = ac.getBean("s3", Student.class);
        Student student4 = ac.getBean("s4", Student.class);
        Student student5 = ac.getBean("s5", Student.class);
        System.out.println(student);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);
        System.out.println(student5);

        Teacher teacher = ac.getBean("t1", Teacher.class);
        Teacher teacher2 = ac.getBean("t2", Teacher.class);
        Teacher teacher3 = ac.getBean("t3", Teacher.class);
        Teacher teacher4 = ac.getBean("t4", Teacher.class);
        System.out.println(teacher);
        System.out.println(teacher2);
        System.out.println(teacher3);
        System.out.println(teacher4);
    }
}
