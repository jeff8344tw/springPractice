package com.jeff.book.service.impl;

import com.jeff.book.service.BookService;
import com.jeff.book.service.Cashier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CashierServiceImpl implements Cashier {

    @Autowired
    private BookService service;

    @Override
    public void checkOut(Integer uid, List<Integer> bids) {
        for(Integer bid : bids){
            service.buyBook(bid, uid);
        }
    }
}
