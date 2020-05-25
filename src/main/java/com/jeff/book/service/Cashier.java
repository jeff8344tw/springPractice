package com.jeff.book.service;

import java.util.List;

public interface Cashier {

    void checkOut(Integer uid, List<Integer> bids);
}
