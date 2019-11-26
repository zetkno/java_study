package com.zetkno.aop;

import org.aspectj.lang.JoinPoint;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.LinkedList;

public class AopTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        TargetObj o = (TargetObj) context.getBean("target");
        String s = o.method1();
        System.out.println(s);
//        System.out.println("-------------------------");
//        o.method2();
    }
}
