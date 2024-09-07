package com.danozzo.jobmatch.JobMatch.controller;

import com.danozzo.jobmatch.JobMatch.model.User;
import com.danozzo.jobmatch.JobMatch.service.IUserService;
import com.danozzo.jobmatch.JobMatch.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/users")
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping("/register")
    public UserDto register(@RequestBody User user) {
        userService.registerUser(user);

        return new UserDto(user);
    }


}
