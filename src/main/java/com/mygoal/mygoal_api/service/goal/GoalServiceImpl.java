package com.mygoal.mygoal_api.service.goal;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mygoal.mygoal_api.entity.Goal;
import com.mygoal.mygoal_api.entity.GoalRequest;
import com.mygoal.mygoal_api.entity.User;
import com.mygoal.mygoal_api.exception.goal.GoalNotFoundException;
import com.mygoal.mygoal_api.exception.goal.NoGoalUnderUserIdException;
import com.mygoal.mygoal_api.repository.goal_repo.GoalRepository;

@Service
public class GoalServiceImpl implements GoalService {

    @Autowired
    GoalRepository goalRepo;

    public Goal saveGoal(GoalRequest goalRequest, User user) {
        Goal goal = new Goal(goalRequest);
        goal.setUser(user);
        return goalRepo.save(goal);
    }
// ? should we trust that user_id is in our DB or we should run it through and verify User with user_id presence
// ! for now we will trust that user_id is legit :)
    @Override
    public Goal getGoal(Long user_id, Long goal_id){
        Goal goal = getGoalHelper(goal_id);
        if(goal.getUser().getId().equals(user_id)) return goal;
        throw new NoGoalUnderUserIdException(user_id, goal_id);
    }

    private Goal getGoalHelper(Long goal_id){
        Optional<Goal> goalOpt = goalRepo.findById(goal_id);
        if(goalOpt.isPresent()) return goalOpt.get();
        throw new GoalNotFoundException(goal_id);
    }
}
