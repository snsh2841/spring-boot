package com.example.demo.core.service;

import com.example.demo.core.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

     List<User> getAllUsers();

     User findByUsrLoginId(String usrLoginId);

}