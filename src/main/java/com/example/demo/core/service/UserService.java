package com.example.demo.core.service;

import com.example.demo.core.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    public List<User> getAllUsers();
}