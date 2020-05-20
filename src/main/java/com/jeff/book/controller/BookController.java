package com.jeff.book.controller;

import com.jeff.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {

    @Autowired
    private BookService service;

    public void buyBook(){
        service.buyBook(1, 1001);
    }
}
