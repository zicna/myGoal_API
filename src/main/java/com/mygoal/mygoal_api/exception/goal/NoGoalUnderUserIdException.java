package com.mygoal.mygoal_api.exception.goal;

public class NoGoalUnderUserIdException extends RuntimeException{
    public NoGoalUnderUserIdException(Long user_id, Long goal_id){
        super("No goal with id " + goal_id + " under user with id "+user_id+"");
    }
}
