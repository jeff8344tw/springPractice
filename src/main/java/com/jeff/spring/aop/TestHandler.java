package com.jeff.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class TestHandler {

    public void test(){
        System.out.println("test aspect");
    }
}
