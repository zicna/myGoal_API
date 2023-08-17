package com.mygoal.mygoal_api.exception.goal;

public class GoalNotFoundException extends RuntimeException {
    public GoalNotFoundException(Long goal_id) {
        super("Goal under id: " + goal_id + " is not found.");
    }
}
