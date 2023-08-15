package com.mygoal.mygoal_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// TODO: Add validation for GoalRequest
// TODO: Add relationship between User and Goal

// ! Validation
// TODO: create custom validation for user password field 

// !Goal and User
// TODO: refactor so User/UserRequest and Goal/GoalRequest has same super class


@SpringBootApplication
public class MygoalApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MygoalApiApplication.class, args);
		// System.out.println("Hello World");
	}

}
