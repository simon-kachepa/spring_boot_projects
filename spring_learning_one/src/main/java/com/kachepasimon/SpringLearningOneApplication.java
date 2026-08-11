package com.kachepasimon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringLearningOneApplication {

	public static void main(String[] args) {
		var applicationContext = SpringApplication.run(SpringLearningOneApplication.class, args);

		MyFirstClass myFirstClass = applicationContext.getBean(MyFirstClass.class);
		System.out.println(myFirstClass.greeting());
	}

	@Bean
	public MyFirstClass myFirstClass(){
		return new MyFirstClass();
	}

}
