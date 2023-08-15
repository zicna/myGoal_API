package com.mygoal.mygoal_api.service.goal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mygoal.mygoal_api.entity.Goal;
import com.mygoal.mygoal_api.repository.goal_repo.GoalRepository;
import com.mygoal.mygoal_api.request.GoalRequest;

@Service
public class GoalServiceImpl implements GoalService {

    @Autowired
    GoalRepository goalRepo;

    public Goal saveGoal(GoalRequest goalRequest) {
        return goalRepo.save(goalRequest);
    }
}
