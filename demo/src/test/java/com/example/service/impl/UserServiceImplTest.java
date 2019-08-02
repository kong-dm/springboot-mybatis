package com.example.service.impl;

import com.example.demo.DemoApplication;
import com.example.pojo.User;
import com.example.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author kdm
 * @date 2019/8/2 16:42
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class UserServiceImplTest {
    @Autowired
   private  UserService userService;
    @Test
    public  void  queryUserById(){
        User  user=userService.queryUserById(1);
        System.out.println(user);

    }

}