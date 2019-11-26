package com.zetkno.service;

import org.springframework.stereotype.Service;

@Service("dogImpl")
public class DogImpl implements IAnimal{

    public void bray() {
        System.out.println("狗叫");
    }
}
