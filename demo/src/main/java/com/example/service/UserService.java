package com.example.service;

import com.example.pojo.User;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author kdm
 * @date 2019/8/2 9:23
 * 用户
 */
public interface  UserService {

    /**
     * 根据用户id查询
     * @param uid
     * @return
     */
    User queryUserById(Integer uid);


    /**
      * 添加用户
      * @param user
      * @return
      */
      Integer saveUser(User user);


    /**
      *登录
     * @param account
     * @param password
     * @return
     */
    User login(String account,String password);

    /**
     * 修改用户
     * @param user
     * @return
     */
    Integer updateUser(User user);

    /**
     * 删除用户
     * @param id
     * @return
     */
    Integer deleteUser(Integer id,boolean status);


    User  queryUserAccount(String account);


}
