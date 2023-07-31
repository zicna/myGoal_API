package com.mygoal.mygoal_api.web;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import com.mygoal.mygoal_api.entity.User;
import com.mygoal.mygoal_api.request.UserRequest;
import com.mygoal.mygoal_api.service.UserService;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping(value = "/")
    public ResponseEntity<String> homePage() {
        return new ResponseEntity<>("hello world", HttpStatus.OK);
    }

    @PostMapping(value = "/singup")
    public ResponseEntity<User> userSignup(@RequestBody User entity) {
        User user = userService.findOrCreateUser(entity);

        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    @PostMapping(value = "/user")
    public ResponseEntity<User> createUserViaUserRequest(@RequestBody UserRequest userRequest) {
        User user = new User(userRequest);
        return new ResponseEntity<User>(userService.findOrCreateUser(user), HttpStatus.OK);

    }

    @GetMapping(value = "/login")
    public ResponseEntity<User> userLogin(@RequestBody User entity) {
        User user = userService.findByEmail(entity.getEmail());
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
