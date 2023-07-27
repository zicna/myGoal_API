package com.mygoal.mygoal_api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.mygoal.mygoal_api.exception.UserNotFoundException;

@ControllerAdvice
public class ApplicationExceptionHandler {

    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<String> userNotFoundByEmailExcHandler(UserNotFoundException ex){
        return new ResponseEntity<String>(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }
    
}