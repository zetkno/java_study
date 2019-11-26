package com.zetkno.dynamicProxy;


public class Client {
    public static void main(String[] args) {
        Host host = new Host();
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setTarget(host);
        Rent proxy = (Rent)pih.getProxy();
        proxy.rent();
    }
}
