package com.jeff.book_xml.service;

import java.util.List;

public interface Cashier {

    void checkOut(Integer uid, List<Integer> bids);
}
