package com.kachepasimon;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

@Service
@PropertySource("classpath:custom.properties")
public class MyFirstService {

    private final MyFirstClass myFirstClass;
    @Value("Hello my fellow Spring-boot-learners")
    private String myCustomProperty;
    @Value("${greeting.learners.property}")
    private String customPropertyFromProperties;
    @Value("${greeting.learners.from.custom.property}")
    private String customPropertyFromAnotherFile;

    public MyFirstService(MyFirstClass myFirstClass){
        this.myFirstClass = myFirstClass;
    }

    public String sayHello(){
        return "The Dependency is saying: " + myFirstClass.greeting();
    }

    public String getMyCustomProperty(){
        return myCustomProperty;
    }

    public String getCustomPropertyFromProperties(){
        return customPropertyFromProperties;
    }

    public String getCustomPropertyFromAnotherFile(){
        return customPropertyFromAnotherFile;
    }
}
