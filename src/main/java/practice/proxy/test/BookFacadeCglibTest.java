package practice.proxy.test;

import practice.proxy.BookFacadeCglib;
import practice.proxy.dao.impl.BookFacadeImplClass;

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
