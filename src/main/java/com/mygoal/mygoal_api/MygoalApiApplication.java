package com.mygoal.mygoal_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// ! Refactor 

// ! Validation
// TODO: Add validation for GoalRequest
// Notes:
// 1. start date- can NOT be in past 
// 2. end date- can NOT be in before start date
// 3. status- must be one of (custom validation)
// 4. type- must be one of (custom validation) or something else 
// ! Exceptions
// TODO: Create separate Goal and User class to handle each exceptions
// TODO: handle MethodArgumentNotValidException.class



@SpringBootApplication
public class MygoalApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MygoalApiApplication.class, args);
	}

}
