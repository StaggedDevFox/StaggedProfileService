package com.stagged.profile.controller;

import com.stagged.profile.model.User;
import com.stagged.profile.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/profile")
public class ProfileController {

    @Autowired
    UserService userService;

    @GetMapping("/user/{email}")
    public User getUser(@PathVariable String email) {
        return userService.getUserDetails(email);
    }

}
