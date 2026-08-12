package com.kachepasimon;

import org.springframework.stereotype.Service;

@Service
public class MyFirstService {

    MyFirstClass myFirstClass;

    public MyFirstService(MyFirstClass myFirstClass){
        this.myFirstClass = myFirstClass;
    }

    public String sayHello(){
        return "The Dependency is saying: " + myFirstClass.greeting();
    }
}
