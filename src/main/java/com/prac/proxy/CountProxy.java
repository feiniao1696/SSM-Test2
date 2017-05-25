package com.prac.proxy;

import com.prac.proxy.dao.Count;
import com.prac.proxy.dao.impl.CountImpl;

/**
 * Created by win0 on 2017/5/25.
 */
public class CountProxy implements Count {
    private CountImpl countImpl;

    /**
     * 覆盖默认构造器
     *
     * @param countImpl
     */
    public CountProxy(CountImpl countImpl) {
        this.countImpl = countImpl;
    }

    @Override
    public void queryCount() {
        System.out.println("事务处理之前");
        // 调用委托类的方法;
        countImpl.queryCount();
        System.out.println("事务处理之后");
    }

    @Override
    public void updateCount() {
        System.out.println("事务处理之前");
        // 调用委托类的方法;
        countImpl.updateCount();
        System.out.println("事务处理之后");

    }
}
