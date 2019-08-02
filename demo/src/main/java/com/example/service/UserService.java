package com.example.service;

import com.example.pojo.User;

/**
 * @author kdm
 * @date 2019/8/2 9:23
 */
public interface  UserService {

    /**
     * 根据用户id查询
     * @param uid
     * @return
     */
    User queryUserById(Integer uid);
}
