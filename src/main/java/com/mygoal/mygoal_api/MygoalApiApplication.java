package com.mygoal.mygoal_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// TODO: basic validation for User entity
// TODO: refactor User validation into UserRequest and use it in controller for USer builder

// ! Validation
// TODO: create custom validation for user password field 


@SpringBootApplication
public class MygoalApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MygoalApiApplication.class, args);
		// System.out.println("Hello World");
	}

}
