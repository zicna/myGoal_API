package com.mygoal.mygoal_api.service.user;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mygoal.mygoal_api.entity.User;
import com.mygoal.mygoal_api.entity.UserRequest;
import com.mygoal.mygoal_api.exception.user.UserNotFoundException;
import com.mygoal.mygoal_api.repository.user_repo.UserRepository;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  UserRepository userRepository;

  public User findOrCreateUser(UserRequest userRequest) {
    Optional<User> userOpt = userRepository.findByEmail(userRequest.getEmail());
    if (userOpt.isPresent())
      return userOpt.get();
    // * mapping userRequest to user entity
    User user = new User(userRequest);
    return userRepository.save(user);

  }

  public User findByEmail(String email) {
    Optional<User> userOpt = userRepository.findByEmail(email);
    if (userOpt.isPresent())
      return userOpt.get();
    else
      throw new UserNotFoundException(email);
  }

  public User findById(Long id) {
    Optional<User> userOpt = userRepository.findById(id);
    if (userOpt.isPresent())
      return userOpt.get();
    else
      throw new UserNotFoundException(id);
  }

}
