package com.mygoal.mygoal_api.repository.user_repo;



import com.mygoal.mygoal_api.entity.User;

public class UserRepositoryCustomImpl implements UserRepositoryCustom {

    // @Autowired
    // UserRepository userRepository;

    // public User findOrCreateUser(User entity) {
    //     ArrayList<User> allUsers = new ArrayList<>();
    //     userRepository.findAll().forEach(user -> allUsers.add(user));

    //     if (allUsers.contains(entity))
    //         return entity;
    //     return userRepository.save(entity);

    // }
    public User findOrCreateUser(User entity){
        return new User();
    }
}
