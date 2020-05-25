package com.jeff.book;

import com.jeff.book.controller.BookController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("book.xml");
        BookController bookController = ac.getBean("bookController", BookController.class);
//        bookController.buyBook();
        bookController.checkOut();
    }
}
