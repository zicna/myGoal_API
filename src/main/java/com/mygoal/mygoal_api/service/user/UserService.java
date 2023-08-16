package com.mygoal.mygoal_api.service.user;

import com.mygoal.mygoal_api.entity.User;
import com.mygoal.mygoal_api.entity.UserRequest;

public interface UserService {
    public User findOrCreateUser(UserRequest userRequest);

    public User findByEmail(String email);

    public User findById(Long id);
}
