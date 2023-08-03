package com.mygoal.mygoal_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// TODO: Add Goal entity, GoalRequest with validation, Service, Repositry, Controller
// TODO: Add relationship between User and Goal

// ! Validation
// TODO: create custom validation for user password field 


@SpringBootApplication
public class MygoalApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MygoalApiApplication.class, args);
		// System.out.println("Hello World");
	}

}
