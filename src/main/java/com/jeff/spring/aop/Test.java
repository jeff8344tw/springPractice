package com.jeff.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("aop.xml");
        MathI math = ac.getBean("mathImpl", MathI.class);
        int result = math.sub(1,1);
        System.out.println("result = "+result);

        TestHandler testHandler = ac.getBean("testHandler", TestHandler.class);
        testHandler.test();
    }
}
