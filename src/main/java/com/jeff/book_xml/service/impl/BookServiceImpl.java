package com.jeff.book_xml.service.impl;

import com.jeff.book_xml.dao.BookDao;
import com.jeff.book_xml.exception.MyException;
import com.jeff.book_xml.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    /**
     * @Transactional: 對方法中所已的操作作為一個事務進行管理
     * 在方法上使用，只對方法有效果
     * 再累上使用，對類中所有的方法都有效果
     * @Transactional中可以設置的屬性
     * propagation: A方法和B方法都有事務，當A再調用B時，會將A中的事務傳播給B方法，B方法對於事務的處理方式就是事務的傳播行為
     * Propagation.REQUIRED:必須使用調用者的事務
     * Propagation.REQUIRES_NEW:將調用者的事務掛起，不使用調用者的事務，使用新的事務進行處理
     *
     * isolation:事務的隔離級別，在開發的情況下，操作事務的一種規定
     * 讀未提交:髒讀 1
     * 讀已提交:不可重複讀 2
     * 可重複讀:幻讀 3
     * 串型化:性能低，消耗大 8
     * timeout:在事務強制回滾前最多可以執行(等待)的時間
     *
     * readOnly:指定當前事務中的一系列的操作是否為只讀
     * 若設置為只讀，不管事務中有沒有寫的操作，mysql都會在請求訪問數據的時候不加鎖，提高性能
     * 但是如果有寫操作的情況，建議一定不能設置只讀
     *
     * rollbackFor|rollbackForClassName|noRollbackFor|noRollbackForClassName
     *
     */
    @Transactional(propagation= Propagation.REQUIRES_NEW, timeout = 3, rollbackFor = {NullPointerException.class, MyException.class})
    public void buyBook(Integer bid, Integer uid) {
        Integer price = bookDao.selectPrice(bid);
        bookDao.updateSt(bid);
        bookDao.updateBalance(uid, price);
    }
}
