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

    @Override
    public Goal saveGoal(GoalRequest goalRequest, Long user_id) {
        User user = userService.findById(user_id);
        Goal goal = new Goal(goalRequest);
        goal.setUser(user);
        return goalRepo.save(goal);
    }

    @Override
    public Goal getGoal(Long user_id, Long goal_id) {
        return matchGoalToUser(goal_id, user_id);
    }

    @Override
    public Goal editGoal(Long user_id, Long goal_id, GoalRequest goalRequest) {
        Goal newGoal = new Goal(goalRequest);
        Goal oldGoal = matchGoalToUser(goal_id, user_id);

        oldGoal.updateAllFields(newGoal);

        return goalRepo.save(oldGoal);
    }

    @Override
    public void deleteGoal(Long user_id, Long goal_id) {
        matchGoalToUser(goal_id, user_id);

        goalRepo.deleteById(goal_id);
    }

    private Goal matchGoalToUser(Long goal_id, Long user_id) {
        Goal goal = findGoalById(goal_id);
        User user = userService.findById(user_id);
        if (goal.getUser().getId().equals(user.getId()))
            return goal;
        throw new NoGoalUnderUserIdException(user_id, goal_id);
    }

    private Goal findGoalById(Long goal_id) {
        Optional<Goal> goalOpt = goalRepo.findById(goal_id);
        if (goalOpt.isPresent())
            return goalOpt.get();
        throw new GoalNotFoundException(goal_id);
    }
}
