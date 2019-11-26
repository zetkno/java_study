package com.zetkno.dynamicProxy.cglibProxy;

import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.Enhancer;

public class Test {

    /**
     *     cglib动态代理的实现步骤
     *     1.生成空的字节码对象 Enhancer
     *     2.设定这个字节码对象是目标对象的子类
     *     3.设置被增强的方法
     *     4.创建代理对象
     *
     */

    public static void main(String[] args) {
        Enhancer en = new Enhancer();
        en.setSuperclass(Student.class);

        Callback callback = new CallbackMethod();
        en.setCallback(callback);
        Student stu = (Student) en.create();
        stu.study();
        stu.test();
    }
}
