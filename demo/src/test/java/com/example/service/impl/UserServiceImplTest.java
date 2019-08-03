package com.example.service.impl;

import com.example.demo.DemoApplication;
import com.example.pojo.User;
import com.example.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static com.example.common.Lestutil.md5Password;
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


    @Test
    public  void  saveUser(){
        User user=new User();
        user.setUserName("张三");
        user.setAccount("xxx");
        user.setPassword(md5Password("a1234567"));
        user.setUserAge(1);
        user.setUserAddress("xxxxxx");
        user.setUserSex("xxxx");
        userService.saveUser(user);
    }

    @Test
    public  void   login(){
        User user=userService.login("zss",md5Password("a123456"));
        System.out.println(user);
    }

    @Test
    public  void  updateUser() {
        User user = new User();
        user.setUserId(2);
        user.setAccount("zs");
        user.setPassword(md5Password("a123456"));
        user.setUserAddress("上海");
        user.setUserSex("男");
        userService.updateUser(user);
    }
 @Test
    public  void  deleteUser(){
        Integer integer=userService.deleteUser(2,true);
        System.out.println(integer);

 }
}