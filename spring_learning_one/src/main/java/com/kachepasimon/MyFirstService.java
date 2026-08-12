package com.kachepasimon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {

    private final MyFirstClass myFirstClass;
    Environment environment;

    public MyFirstService(MyFirstClass myFirstClass){
        this.myFirstClass = myFirstClass;
    }

    public String sayHello(){
        return "The Dependency is saying: " + myFirstClass.greeting();
    }

    public String getJavaVersion(){
        return "I am using Java Version: " + environment.getProperty("java.version");
    }

    public String getOsName(){
        return "I am using: " + environment.getProperty("os.name");
    }

    @Autowired
    public void setEnvironment(Environment environment){
        this.environment = environment;
    }
}
