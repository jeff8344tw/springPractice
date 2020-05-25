package com.jeff.book_xml.service.impl;

import com.jeff.book_xml.service.BookService;
import com.jeff.book_xml.service.Cashier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CashierServiceImpl implements Cashier {

    @Autowired
    private BookService service;

    @Override
    public void checkOut(Integer uid, List<Integer> bids) {
        for (Integer bid : bids) {
            service.buyBook(bid, uid);
        }
    }
}
