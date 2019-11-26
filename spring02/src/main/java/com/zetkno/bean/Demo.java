package com.zetkno.bean;

public class Demo {
    void A() {
        System.out.println("父类中protected修饰");
    }
}

class Demo2 extends Demo {
    public static void main(String[] args) {
        Demo d = new Demo2();
        d.A();
        char[] value = {'a'};
    }
  protected void A(){
        System.out.println("子类重写父类方法");
    }
}
