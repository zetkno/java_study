package com.zetkno.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//通知类 抽取目标对象中
@Component
@Aspect
public class MyAdvice {
//    @Before(value="execution(* *..*.method1())")
//    public void one() {
//        System.out.println("通知里的one方法");
//    }

    public void two() {
        System.out.println("通知里的two方法");
    }

    public void after() {
        System.out.println("after");
    }

    public void before1() {
        System.out.println("before1");
    }
    public void before2() {
        System.out.println("before2");
    }
    public void before3() {
        System.out.println("before3");
    }
    public void around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around start");
//        pjp.proceed(); //调用目标对象中被拦截的方法
//        System.out.println("around end");
    }
    public void after1() {
        System.out.println("after1");
    }
    public void after2() {
        System.out.println("after2");
    }

    public void getArgs(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object[] args = proceedingJoinPoint.getArgs(); //得到参数
        for (int i = 0; i < args.length; i++) {
            args[i] = (Integer)args[i] + 10;
            System.out.println(args[i]);
        }
        System.out.println("-------方法执行前--------");
        proceedingJoinPoint.proceed(args);
    }
//    public void getArgs1(String a, int b) {
//        System.out.println(a);
//        System.out.println(b);
//    }

    public String getReturn(ProceedingJoinPoint point) throws Throwable {
        Object res = point.proceed();
        System.out.println((String)res);
        System.out.println("getReturn");
        return "abc";
    }

}
