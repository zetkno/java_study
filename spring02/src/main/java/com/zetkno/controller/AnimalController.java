package com.zetkno.controller;

import com.zetkno.service.DogImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@Controller
public class AnimalController {

    @Autowired
    private  DogImpl dog;

    public void main() {
        dog.bray();
    }
}
