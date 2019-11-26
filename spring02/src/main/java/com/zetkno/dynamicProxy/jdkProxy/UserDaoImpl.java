package com.zetkno.dynamicProxy.jdkProxy;

public class UserDaoImpl implements UserDao {

    @Override
    public void add() {
        System.out.println("add...");
    }

    @Override
    public void delete() {
        System.out.println("delete...");
    }
}
