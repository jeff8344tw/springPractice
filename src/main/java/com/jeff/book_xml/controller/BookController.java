package com.jeff.book_xml.controller;

import com.jeff.book_xml.service.BookService;
import com.jeff.book_xml.service.Cashier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookService service;

    @Autowired
    private Cashier cashier;

    public void buyBook(){
        service.buyBook(1, 1001);
    }

    public void checkOut(){
        List<Integer> bids = new ArrayList<>();
        bids.add(1);
        bids.add(2);
        cashier.checkOut(1001, bids);
    }
}
