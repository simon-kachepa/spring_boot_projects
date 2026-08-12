package com.kachepasimon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ApplicationConfig {

    @Bean
    @Qualifier("beanOne")
    public MyFirstClass myFirstBean(){
        return new MyFirstClass("First Bean");
    }

    @Bean
    @Qualifier("beanTwo")
    public MyFirstClass mySecondBean(){
        return new MyFirstClass("Second Bean");
    }

    @Bean
    @Primary
    public MyFirstClass myThirdBean(){
        return new MyFirstClass("Third Bean");
    }
}
