package com.example.demo;

import com.example.demo.core.domain.User;
import com.example.demo.core.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class DemoApplicationTests {


    @Autowired
    UserService userService;

    @Test
    public void contextLoads() {
    }


    @Test
    public void testUserListing(){

        List<User> users =  userService.getAllUsers();

        Assert.assertEquals(users.size(), 2);
    }

}
