package com.kachepasimon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLearningOneApplication {

	public static void main(String[] args) {
		var applicationContext = SpringApplication.run(SpringLearningOneApplication.class, args);

		MyFirstService myFirstService = applicationContext.getBean(MyFirstService.class);
		System.out.println(myFirstService.sayHello());
	}

}
