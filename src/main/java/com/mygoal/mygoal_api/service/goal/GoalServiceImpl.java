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
import com.mygoal.mygoal_api.service.user.UserService;

@Service
public class GoalServiceImpl implements GoalService {

    @Autowired
    GoalRepository goalRepo;

    @Autowired
    UserService userService;

    public Goal saveGoal(GoalRequest goalRequest, Long user_id) {
        User user = userService.findById(user_id);
        Goal goal = new Goal(goalRequest);
        goal.setUser(user);
        return goalRepo.save(goal);
    }

    
    @Override
    public Goal getGoal(Long user_id, Long goal_id) {
        Goal goal = findGoalById(goal_id);
        User user = userService.findById(user_id);
        if (goal.getUser().getId().equals(user.getId()))
            return goal;
        throw new NoGoalUnderUserIdException(user_id, goal_id);
    }

    @Override
    public Goal editGoal(Long user_id, Long goal_id, GoalRequest goalRequest) {
        Goal newGoal = new Goal(goalRequest);
        Goal oldGoal = findGoalById(goal_id);

        if (!oldGoal.getUser().getId().equals(user_id))
            throw new NoGoalUnderUserIdException(user_id, goal_id);

        oldGoal.setAllFields(newGoal);

        return goalRepo.save(oldGoal);
    }

    @Override
    public void deleteGoal(Long user_id, Long goal_id) {
        Goal goal = findGoalById(goal_id);
        if (!goal.getUser().getId().equals(user_id))
            throw new NoGoalUnderUserIdException(user_id, goal_id);

        goalRepo.deleteById(goal_id);
    }

    private Goal findGoalById(Long goal_id) {
        Optional<Goal> goalOpt = goalRepo.findById(goal_id);
        if (goalOpt.isPresent())
            return goalOpt.get();
        throw new GoalNotFoundException(goal_id);
    }
}
