package com.mygoal.mygoal_api.exception.user;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String email){
        super("Email: " + email + " not registered");
    }
    public UserNotFoundException(Long id){
        super("User under id: " + id + " can not be found.");
    }
}
