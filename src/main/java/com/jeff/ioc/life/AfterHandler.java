package com.jeff.ioc.life;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class AfterHandler implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Person person = (Person) bean;
        if(person.getSex().equals("male")){
            person.setName("jeffMale");
        }else{
            person.setName("jeffFemale");
        }
        return person;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
