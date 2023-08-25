package com.mygoal.mygoal_api.exception_handlers;

import java.util.HashMap;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.mygoal.mygoal_api.exception.goal.GoalNotFoundException;
import com.mygoal.mygoal_api.exception.goal.NoGoalUnderUserIdException;
import com.mygoal.mygoal_api.exception.goal.WrongGoalInputException;

@ControllerAdvice
public class GoalExceptionHandlers {
    @ExceptionHandler(NoGoalUnderUserIdException.class)
    public ResponseEntity<String> x(NoGoalUnderUserIdException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(GoalNotFoundException.class)
    public ResponseEntity<String> y(GoalNotFoundException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(WrongGoalInputException.class)
    public ResponseEntity<HashMap<String, String>> wrongGoalInputHandler(WrongGoalInputException ex) {
        return new ResponseEntity<HashMap<String, String>>(ex.getErrors(), HttpStatus.BAD_REQUEST);
    }
}
