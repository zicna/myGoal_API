package com.mygoal.mygoal_api.repository.goal_repo;

import org.springframework.data.repository.CrudRepository;

import com.mygoal.mygoal_api.entity.Goal;

public interface GoalRepository extends CrudRepository<Goal, Long>{
}
