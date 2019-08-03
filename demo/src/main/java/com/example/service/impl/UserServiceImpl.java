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

    @Override
    public Integer saveUser(User user) {
      return userMapper.saveUser(user);
    }

    @Override
    public User login(String account, String password) {
        return userMapper.selectByAccount(account,password);
    }


    @Override
    public Integer updateUser(User user) {
        return userMapper.updateByPrimaryKeySelective(user);
    }


    @Override
    public Integer deleteUser(Integer id,boolean status) {
        return userMapper.updateByStatus(id,status);
    }

    @Override
    public User queryUserAccount(String account) {

        return  userMapper.queryByAccount(account);
    }
}
