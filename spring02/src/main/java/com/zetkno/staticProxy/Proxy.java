package com.zetkno.staticProxy;

import com.zetkno.dynamicProxy.Host;
import com.zetkno.dynamicProxy.Rent;

public class Proxy implements Rent {
    private Host host;
    public Proxy(){

    }

    public Proxy(Host host) {
        this.host = host;
    }

    public void setHost(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        seeHouse();
        host.rent();
        fare();
    }
    public void seeHouse() {
        System.out.println("看房");
    }
    public void fare() {
        System.out.println("收中介费");
    }
}
