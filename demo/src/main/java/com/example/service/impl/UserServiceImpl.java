package com.example.service.impl;

import com.example.dao.UserMapper;
import com.example.pojo.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author kdm
 * @date 2019/8/2 9:25
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

//    private  Logger log = Logger.getLogger(UserServiceImpl.class);
    @Override
    public User queryUserById(Integer uid) {
        return userMapper.selectUserById(uid);
    }
}
