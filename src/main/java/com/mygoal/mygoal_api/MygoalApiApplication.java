package com.mygoal.mygoal_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// !Goal enpoints
// TODO: 1. create method to retrive single goal
// TODO: 1.1 create exception for: goal not found
// TODO: 1.2 create exception for: goal found but user_id does not match with goals user id
// TODO: 1.3 handle newly created exceptions
// TODO: 1.4 refactor methods in GoalServiceImpl 

// TODO: edit goal method

// TODO: delete goal method


// TODO: Add validation for GoalRequest

// ! Validation
// TODO: create custom validation for user password field 



@SpringBootApplication
public class MygoalApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MygoalApiApplication.class, args);
		// System.out.println("Hello World");
	}

}
