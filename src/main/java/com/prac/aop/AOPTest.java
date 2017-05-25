package com.prac.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by win0 on 2017/5/25.
 */
public class AOPTest {
    public static void main(String[] args)
    {

        System.getProperty("java.class.path");
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("file:D:\\home\\software\\SSM-Test2\\src\\main\\java\\com\\prac\\aop\\aop.xml");

        HelloWorld hw1 = (HelloWorld)ctx.getBean("helloWorldImpl1");
        HelloWorld hw2 = (HelloWorld)ctx.getBean("helloWorldImpl2");
        hw1.printHelloWorld();
        System.out.println();
        hw1.doPrint();

        System.out.println();
        hw2.printHelloWorld();
        System.out.println();
        hw2.doPrint();
    }
}
