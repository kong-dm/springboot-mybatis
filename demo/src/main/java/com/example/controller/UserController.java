package com.example.controller;

import com.example.pojo.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kdm
 * @date 2019/8/2 15:56
 */
@RestController
public class UserController {

    @Autowired
    private UserService service;


    @RequestMapping("admin/user")
    @ResponseBody
    public Object user(){
        return service.queryUserById(1);
    }
}
