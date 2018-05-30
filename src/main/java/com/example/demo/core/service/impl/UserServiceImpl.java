package com.example.demo.core.service.impl;

import com.example.demo.core.domain.User;
import com.example.demo.core.repository.UserRepository;
import com.example.demo.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {

        return (List)userRepository.findAll();
    }

    @Override
    public User findByUsrLoginId(String usrLoginId) {

        return userRepository.findByUsrLoginId(usrLoginId);
    }
}