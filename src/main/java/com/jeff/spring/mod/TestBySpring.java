package com.jeff.spring.mod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBySpring {
    public static void main(String[] args){
        ConfigurableApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = (Person) ac.getBean("personOne");
        Person person2 = ac.getBean("personTwo", Person.class);
        System.out.println(person);
        ac.close();
    }
}
