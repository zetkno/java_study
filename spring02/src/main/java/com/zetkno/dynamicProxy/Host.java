package com.zetkno.dynamicProxy;

import com.zetkno.dynamicProxy.Rent;

public class Host implements Rent {
    @Override
    public void rent() {
        System.out.println("房屋出租");
    }
}
