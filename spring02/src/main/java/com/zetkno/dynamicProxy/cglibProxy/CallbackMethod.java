package com.zetkno.dynamicProxy.cglibProxy;

import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CallbackMethod implements MethodInterceptor {

    /**
     * @param proxy       代理对象
     * @param method      目标对象中的方法
     * @param args        目标对象中的参数
     * @param methodProxy 代理对象中的代理方法对象
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("before...");
        //执行被增强的方法
        Object o = methodProxy.invokeSuper(proxy, args);
        System.out.println("after...");
        return o;
    }
}
