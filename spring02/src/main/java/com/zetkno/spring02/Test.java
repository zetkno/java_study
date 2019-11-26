package com.zetkno.spring02;

import com.zetkno.aop.TargetObj;
import com.zetkno.bean.Employee;
import com.zetkno.controller.AnimalController;
import com.zetkno.service.DogImpl;
import com.zetkno.service.IAnimal;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
//        解析beans文件生成管理相应的对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        Hello hello = (Hello)context.getBean("hello");
//        Employee employee = (Employee) context.getBean("employee");
//        System.out.println(employee);
////        hello.show();
//        IAnimal animl = (DogImpl) context.getBean("");
//        AnimalController animal = (AnimalController) context.getBean("animalController");
//        animal.main();
        TargetObj obj = (TargetObj) context.getBean("target");

    }
}
