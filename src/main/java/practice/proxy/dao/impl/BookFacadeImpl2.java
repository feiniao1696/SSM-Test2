package practice.proxy.dao.impl;

import practice.proxy.dao.BookFacade;

/**
 * Created by win0 on 2017/5/25.
 */
public class BookFacadeImpl2 implements BookFacade{
    @Override
    public void addBook() {
        System.out.println("增加图书方法2。。。");
    }
}
