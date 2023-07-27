package com.mygoal.mygoal_api.service;


import com.mygoal.mygoal_api.entity.User;
public interface UserService {
    public User findOrCreateUser(User entity);
    public User findByEmail(String email);
}
