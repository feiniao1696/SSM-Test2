package com.prac.proxy.test;

import com.prac.proxy.BookFacadeCglib;
import com.prac.proxy.dao.impl.BookFacadeImplClass;

/**
 * Created by win0 on 2017/5/25.
 */
public class BookFacadeCglibTest {
    public static void main(String[] args) {
        BookFacadeCglib cglib=new BookFacadeCglib();
        BookFacadeImplClass bookCglib=(BookFacadeImplClass)cglib.getInstance(new BookFacadeImplClass());
        bookCglib.addBook();
    }
}
