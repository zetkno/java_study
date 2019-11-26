package com.zetkno.dynamicProxy.jdkProxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

// 该类要对目标对象进行代理并进行功能增强
public class MyInvocationHandler implements InvocationHandler {

    //定义目标对象
    Object obj;

    //用构造方法传进来
    public MyInvocationHandler(Object obj) {
        super();
        this.obj = obj;
    }

    /**
     *
     * @param proxy 被代理的对象（不用）
     * @param method 目标对象的方法对象 jdk传过来
     * @param args 该方法对象的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object obj2 = null;
        if ("add".equals(method.getName())) {
            System.out.println("before advice");
            obj2 = method.invoke(obj, args);
            System.out.println("after advice");
        } else {
            obj2 = method.invoke(obj, args);
        }

        return obj2;
    }
}
