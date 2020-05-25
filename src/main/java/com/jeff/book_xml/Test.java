package com.jeff.book_xml;

import com.jeff.book_xml.controller.BookController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("book_xml.xml");
        BookController controller = ac.getBean("bookController", BookController.class);
        controller.buyBook();
    }
}
