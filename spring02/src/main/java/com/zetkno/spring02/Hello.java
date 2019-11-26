package com.zetkno.spring02;

public class Hello {
    private String name;

    public Hello() {
//        System.out.println("hello 被创建");
    }

//    public Hello(String name) {
//
//    }


    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("hello " + name);
    }
}
