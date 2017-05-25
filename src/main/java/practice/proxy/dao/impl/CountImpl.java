package practice.proxy.dao.impl;
import practice.proxy.dao.Count;

/**
 * Created by win0 on 2017/5/25.
 */
public class CountImpl implements Count{
    @Override
    public void queryCount() {
        System.out.println("查看账户方法...");

    }

    @Override
    public void updateCount() {
        System.out.println("修改账户方法...");

    }
}
