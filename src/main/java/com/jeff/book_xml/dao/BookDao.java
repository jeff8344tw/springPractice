package com.jeff.book_xml.dao;

public interface BookDao {

    Integer selectPrice(Integer bid);

    void updateSt(Integer bid);

    void updateBalance(Integer uid, Integer price);
}
