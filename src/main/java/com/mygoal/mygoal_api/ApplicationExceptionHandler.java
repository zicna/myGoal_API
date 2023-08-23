package com.mygoal.mygoal_api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.mygoal.mygoal_api.exception.goal.GoalNotFoundException;
import com.mygoal.mygoal_api.exception.goal.NoGoalUnderUserIdException;
import com.mygoal.mygoal_api.exception.user.UserNotFoundException;
import com.mygoal.mygoal_api.exception.user.WrongUserInputException;

@ControllerAdvice
public class ApplicationExceptionHandler {

    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<String> userNotFoundByEmailExcHandler(UserNotFoundException ex) {
        return new ResponseEntity<String>(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(WrongUserInputException.class)
    public ResponseEntity<String> wrongUserInputExcHandler(WrongUserInputException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(NoGoalUnderUserIdException.class)
    public ResponseEntity<String> x(NoGoalUnderUserIdException ex){
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(GoalNotFoundException.class)
    public ResponseEntity<String> y(GoalNotFoundException ex){
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }
}


