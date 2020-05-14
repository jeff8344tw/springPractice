package com.jeff.ioc.datasource;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) throws Exception {
        ApplicationContext ac = new ClassPathXmlApplicationContext("datasource.xml");
        DruidDataSource bean = ac.getBean("datasource", DruidDataSource.class);
        System.out.println(bean.getConnection());
    }
}
