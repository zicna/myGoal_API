package com.mygoal.mygoal_api.exception_handlers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.mygoal.mygoal_api.exception.user.UserNotFoundException;
import com.mygoal.mygoal_api.exception.user.WrongUserInputException;

public class UserExceptionHandler {
    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<String> userNotFoundByEmailExcHandler(UserNotFoundException ex) {
        return new ResponseEntity<String>(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(WrongUserInputException.class)
    public ResponseEntity<String> wrongUserInputExcHandler(WrongUserInputException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }
}
