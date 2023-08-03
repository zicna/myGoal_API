package com.mygoal.mygoal_api.service.goal;

import org.springframework.beans.factory.annotation.Autowired;

import com.mygoal.mygoal_api.entity.Goal;
import com.mygoal.mygoal_api.repository.goal_repo.GoalRepository;

public class GoalServiceImpl implements GoalService{

    @Autowired GoalRepository goalRepo;
    public Goal saveGoal(Goal entity){
        return goalRepo.save(entity);
    }
}
