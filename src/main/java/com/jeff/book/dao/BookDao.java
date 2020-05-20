package com.jeff.book.dao;

public interface BookDao {

    Integer selectPrice(Integer bid);

    void updateSt(Integer bid);

    void updateBalance(Integer uid, Integer price);
}
