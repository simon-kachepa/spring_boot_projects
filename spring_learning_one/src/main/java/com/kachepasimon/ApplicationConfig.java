package com.kachepasimon;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean("beanOne")
    public MyFirstClass myFirstClass(){
        return new MyFirstClass();
    }
}
