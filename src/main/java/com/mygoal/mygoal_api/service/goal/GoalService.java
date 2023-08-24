package com.mygoal.mygoal_api.service.goal;


import com.mygoal.mygoal_api.entity.Goal;
import com.mygoal.mygoal_api.entity.GoalRequest;

public interface GoalService {
    public Goal saveGoal(GoalRequest goalRequest, Long user_id);
    public Goal getGoal(Long user_id, Long goal_id);
    public Goal editGoal(Long user_id, Long goal_id, GoalRequest goalRequest);
    public void deleteGoal(Long user_id, Long goal_id);
}
