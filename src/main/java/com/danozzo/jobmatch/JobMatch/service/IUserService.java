package com.danozzo.jobmatch.JobMatch.service;

import com.danozzo.jobmatch.JobMatch.model.User;

public interface IUserService {
    User registerUser(User user);

    User findUserByUsername(String username);
}
