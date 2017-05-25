package com.prac.aop;

/**
 * Created by win0 on 2017/5/25.
 */
public class LogHandler
{
    public void LogBefore()
    {
        System.out.println("Log before method");
    }

    public void LogAfter()
    {
        System.out.println("Log after method");
    }
}