package com.kachepasimon;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {

    private final MyFirstClass myFirstClass;

    public MyFirstService(@Qualifier("beanTwo") MyFirstClass myFirstClass){
        this.myFirstClass = myFirstClass;
    }

    public String sayHello(){
        return "The Dependency is saying: " + myFirstClass.greeting();
    }
}
