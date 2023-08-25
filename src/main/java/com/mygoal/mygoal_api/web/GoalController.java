package com.mygoal.mygoal_api.web;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;

import com.mygoal.mygoal_api.entity.Goal;
import com.mygoal.mygoal_api.entity.GoalRequest;
import com.mygoal.mygoal_api.exception.goal.WrongGoalInputException;
import com.mygoal.mygoal_api.service.goal.GoalService;
import com.mygoal.mygoal_api.service.user.UserService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class GoalController {
    @Autowired
    GoalService goalService;

    @Autowired
    UserService userService;

    @PostMapping(value = "user/{user_id}/goal")
    public ResponseEntity<Goal> createGoal(@PathVariable Long user_id, @RequestBody @Valid GoalRequest goalRequest,
            BindingResult result) {
        if (result.hasErrors()) {
            throw new WrongGoalInputException(result.getFieldErrors());
        }
        return new ResponseEntity<Goal>(goalService.saveGoal(goalRequest, user_id), HttpStatus.OK);
    }

    @GetMapping(value = "user/{user_id}/goal/{goal_id}")
    public ResponseEntity<Goal> getGoal(@PathVariable Long user_id, @PathVariable Long goal_id) {

        return new ResponseEntity<Goal>(goalService.getGoal(user_id, goal_id), HttpStatus.OK);
    }

    @PutMapping(value = "user/{user_id}/goal/{goal_id}")
    public ResponseEntity<Goal> updateGoal(@PathVariable Long user_id, @PathVariable Long goal_id,
            @RequestBody @Valid GoalRequest goalRequest) {

        return new ResponseEntity<>(goalService.editGoal(user_id, goal_id, goalRequest), HttpStatus.OK);
    }

    @DeleteMapping(value = "user/{user_id}/goal/{goal_id}")
    public ResponseEntity<String> deleteGoal(@PathVariable Long user_id, @PathVariable Long goal_id) {

        return new ResponseEntity<String>("Goal has been deleted. ", HttpStatus.OK);
    }

}
