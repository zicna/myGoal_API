package com.mygoal.mygoal_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// ! Refactor 
// TODO: Goal Controller
// TODO: Goal ServiceImpl

// ! Validation
// TODO: Add validation for GoalRequest

// ! Exceptions
// TODO: Create separate Goal and User class to handle each exceptions



@SpringBootApplication
public class MygoalApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MygoalApiApplication.class, args);
		// System.out.println("Hello World");
	}

}
