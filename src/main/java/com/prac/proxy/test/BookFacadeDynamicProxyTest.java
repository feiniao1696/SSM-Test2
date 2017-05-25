package com.prac.proxy.test;

import com.prac.proxy.BookFacadeProxy;
import com.prac.proxy.dao.BookFacade;
import com.prac.proxy.dao.impl.BookFacadeImpl;
import com.prac.proxy.dao.impl.BookFacadeImpl2;

/**
 * Created by win0 on 2017/5/25.
 */
public class BookFacadeDynamicProxyTest {
    public static void main(String[] args) {
        BookFacadeProxy proxy = new BookFacadeProxy();
        BookFacade bookProxy = (BookFacade) proxy.bind(new BookFacadeImpl());
        bookProxy.addBook();
        bookProxy = (BookFacade) proxy.bind(new BookFacadeImpl2());
        bookProxy.addBook();
    }
}
