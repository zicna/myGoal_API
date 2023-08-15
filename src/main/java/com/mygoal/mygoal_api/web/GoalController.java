package com.mygoal.mygoal_api.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.mygoal.mygoal_api.entity.Goal;
import com.mygoal.mygoal_api.entity.User;
import com.mygoal.mygoal_api.request.GoalRequest;
import com.mygoal.mygoal_api.service.goal.GoalService;
import com.mygoal.mygoal_api.service.user.UserService;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class GoalController {
    @Autowired
    GoalService goalService;

    @Autowired
    UserService userService;

    @PostMapping(value="user/{user_id}/goal")
    public ResponseEntity<Goal> createGoal(@RequestBody GoalRequest goalRequest, @PathVariable Long user_id) {
        // * for now, this is only a guard clause to check if user is present
        User user = userService.findById(user_id);

        Goal goal = goalService.saveGoal(goalRequest);

        return new ResponseEntity<Goal>(goal, HttpStatus.OK);
        
    }
    
}
