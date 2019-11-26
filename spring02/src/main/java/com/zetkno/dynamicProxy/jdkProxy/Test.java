package com.zetkno.dynamicProxy.jdkProxy;

import java.lang.reflect.*;


public class Test {
    public static void main(String[] args) {
        //create Target Object
        UserDao ud = new UserDaoImpl();
//        jdk的动态代理   对ud做代理
        /**
        newProxyInstance()的三个参数什么意思
            1.loader 类加载器（类的字节码对象获得）写法固定
            2.interfaces 该对象所有实现接口的字节码对象数组 写法固定
            3.需要实现了Invoacation=Handler接口的对象   对目标对象的方法增强就是在这个对象中完成
        */
        InvocationHandler handler = new MyInvocationHandler(ud);
        Object newProxyInstance = Proxy.newProxyInstance(ud.getClass().getClassLoader(), ud.getClass().getInterfaces(), handler);
        UserDao proxy = (UserDao)newProxyInstance;
        proxy.add();
        proxy.delete();
    }
}
