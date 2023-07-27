package com.mygoal.mygoal_api.web;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

import com.mygoal.mygoal_api.entity.User;
import com.mygoal.mygoal_api.service.UserService;
import org.springframework.web.bind.annotation.RequestParam;

// TODO: "/signup" route should create new user only if email privided is not already in use

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

    @GetMapping(value = "/login")
    public ResponseEntity<User> userLogin(@RequestBody User entity) {
        User user = userService.findByEmail(entity.getEmail());
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}

