package com.mygoal.mygoal_api.service.goal;


import com.mygoal.mygoal_api.entity.Goal;
import com.mygoal.mygoal_api.entity.GoalRequest;
import com.mygoal.mygoal_api.entity.User;

public interface GoalService {
    public Goal saveGoal(GoalRequest goalRequest, User user);
    public Goal getGoal(Long user_id, Long goal_id);
    public Goal editGoal(Long user_id, Long goal_id, GoalRequest goalRequest);
    public void deleteGoal(Long user_id, Long goal_id);
}
