package com.mygoal.mygoal_api.service.user;


import com.mygoal.mygoal_api.entity.User;
public interface UserService {
    public User findOrCreateUser(User entity);
    public User findByEmail(String email);
    public User findById(Long id);
}
