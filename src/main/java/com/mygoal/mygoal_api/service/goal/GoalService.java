package com.mygoal.mygoal_api.service.goal;


import com.mygoal.mygoal_api.entity.Goal;
import com.mygoal.mygoal_api.request.GoalRequest;

public interface GoalService {
    public Goal saveGoal(GoalRequest goalRequest);
    // public void saveGoal(Goal entity);
}