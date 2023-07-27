package com.mygoal.mygoal_api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mygoal.mygoal_api.entity.User;
import com.mygoal.mygoal_api.repository.UserRepository;
@Service
public class UserServiceImpl  implements UserService{

    @Autowired
    UserRepository userRepository;
    public User saveUser(User entity){
        return userRepository.save(entity);
    }

    public User findByEmail(String email){
        return userRepository.findByEmail(email);
    }
}
