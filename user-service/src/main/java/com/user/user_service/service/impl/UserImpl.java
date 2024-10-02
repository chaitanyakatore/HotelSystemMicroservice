package com.user.user_service.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.user_service.dao.UserRepo;
import com.user.user_service.entity.User;
import com.user.user_service.exceptions.ResourceNotFoundException;
import com.user.user_service.service.UserService;


@Service
public class UserImpl implements UserService{

    @Autowired
    UserRepo userRepo;

    @Override
    public User saveUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepo.findAll();
    }

    @Override
    public User getUser(long userId) {
        return userRepo.findById(userId).orElseThrow(()-> new ResourceNotFoundException("User not found"));
    }

}
