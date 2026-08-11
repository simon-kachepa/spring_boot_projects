package com.kachepasimon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLearningOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringLearningOneApplication.class, args);

		MyFirstClass myFirstClass = new MyFirstClass();
		System.out.println(myFirstClass.greeting());
	}

}
