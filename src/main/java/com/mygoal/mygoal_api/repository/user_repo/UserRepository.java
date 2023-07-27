package com.mygoal.mygoal_api.repository.user_repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.mygoal.mygoal_api.entity.User;

import jakarta.transaction.Transactional;

public interface UserRepository extends CrudRepository<User, Long>, UserRepositoryCustom {

    @Transactional
    public Optional<User> findByEmail(String email);
}
