package com.prac.aop;

/**
 * Created by win0 on 2017/5/25.
 */
public class HelloWorldImpl2 implements HelloWorld
{
    public void printHelloWorld()
    {
        System.out.println("Enter HelloWorldImpl2.printHelloWorld()");
    }

    public void doPrint()
    {
        System.out.println("Enter HelloWorldImpl2.doPrint()");
        return ;
    }
}
