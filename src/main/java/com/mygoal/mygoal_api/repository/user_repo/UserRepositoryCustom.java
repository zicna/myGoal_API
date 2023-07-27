package com.mygoal.mygoal_api.repository.user_repo;

import com.mygoal.mygoal_api.entity.User;

public interface UserRepositoryCustom {
    public User findOrCreateUser(User entity);
}
