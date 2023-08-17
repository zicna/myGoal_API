package com.mygoal.mygoal_api.exception.user;

public class WrongUserInputException extends RuntimeException{
    public WrongUserInputException(String message){
        super(message + " not accepted. Please try again.");
    }
}
