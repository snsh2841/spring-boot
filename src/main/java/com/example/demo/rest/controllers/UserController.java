package com.example.demo.rest.controllers;


import com.example.demo.core.domain.User;
import com.example.demo.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/api/0.9/json/users/raw/all", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<User> getUsersRaw() {

        List<User> users = new ArrayList<User >(0);

        users = userService.getAllUsers();

        return users;
    }


    @RequestMapping(value = "/api/0.9/json/users/all", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<User>> getUsers() {

        List<User> users ;

        users = userService.getAllUsers();

        return new ResponseEntity<List<User>>(users,HttpStatus.OK);
    }

    @RequestMapping(value = "/api/0.9/json/users/search/{loginId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> getUsersByLoginId(@PathVariable ("loginId") String loginId) {

        User user = userService.findByUsrLoginId(loginId);

        return new ResponseEntity<User>(user,HttpStatus.OK);
    }

    @RequestMapping(value = "/api/0.9/json/users/search", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> getUsersByLoginIdRequestParam(@RequestParam("loginId") String loginId) {

        User user = userService.findByUsrLoginId(loginId);

        return new ResponseEntity<User>(user,HttpStatus.OK);
    }


}