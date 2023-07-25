package com.mygoal.mygoal_api.repository;

import org.springframework.data.repository.CrudRepository;

import com.mygoal.mygoal_api.entity.User;

public interface UserRepository  extends CrudRepository<User, Long>{
}
