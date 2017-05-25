package com.prac.proxy.test;

import com.prac.proxy.dao.impl.CountImpl;
import com.prac.proxy.CountProxy;

/**
 * Created by win0 on 2017/5/25.
 */
public class CountTest {
    public static void main(String[] args) {
        //静态代理
        CountImpl countImpl = new CountImpl();
        CountProxy countProxy = new CountProxy(countImpl);
        countProxy.updateCount();
        countProxy.queryCount();
    }
}
