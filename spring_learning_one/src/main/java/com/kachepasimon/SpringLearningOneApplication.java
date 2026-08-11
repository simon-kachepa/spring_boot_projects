package com.kachepasimon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLearningOneApplication {

	public static void main(String[] args) {
		var applicationContext = SpringApplication.run(SpringLearningOneApplication.class, args);

		MyFirstClass myFirstClass = applicationContext.getBean("beanOne",MyFirstClass.class);
		System.out.println(myFirstClass.greeting());
	}

}
