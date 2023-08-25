package com.mygoal.mygoal_api.exception.goal;

import java.util.HashMap;
import java.util.List;

import org.springframework.validation.FieldError;

public class WrongGoalInputException extends RuntimeException {
    final private List<FieldError> errors;

    public WrongGoalInputException(List<FieldError> err) {
        this.errors = err;
    }

    public HashMap<String, String> getErrors() {
        HashMap<String, String> msg = new HashMap<String, String>();
        this.errors.forEach(err -> msg.put(err.getField(), err.getDefaultMessage()));
        return msg;
    }
}
