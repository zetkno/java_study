package com.zetkno.aop;

//目标对象，切入点，连接点

public class TargetObj {
//    public void method1() {
////        System.out.println(1);  共性的功能用AOP来做 把抽象出来的共性代码做成通知，通知是放在通知类中的
//        System.out.println(2);
//        System.out.println(3);
//    }


//    public void method1(int a, int b) {
//        System.out.println(a + " " + b);
//    }

    //连接点
    public String method1() {
        System.out.println("method1()");
        return "return";
    }

}


