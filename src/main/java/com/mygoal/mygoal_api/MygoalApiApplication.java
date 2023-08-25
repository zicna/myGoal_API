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
// TODO: handle MethodArgumentNotValidException.class, through controller and controllerAdvice for User



@SpringBootApplication
public class MygoalApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MygoalApiApplication.class, args);
	}

}
