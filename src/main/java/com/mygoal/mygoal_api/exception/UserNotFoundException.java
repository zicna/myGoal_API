package com.mygoal.mygoal_api.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String email){
        super("Email: " + email + " not registered");
    }
}
