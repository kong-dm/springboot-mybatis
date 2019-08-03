package com.example.dao;


import com.example.pojo.Role;
import com.example.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
  User selectUserById(@Param("id") Integer id);

  Integer saveUser(User user);

  User selectByAccount(@Param("account")String account,@Param("password") String password);

  Integer updateByPrimaryKeySelective(User user);


  int deleteByPrimaryKey(@Param("userId") Integer userId);

  int updateByStatus(@Param("userId") Integer userId,@Param("status") boolean status);

  List<Role> queryRoleByAccount(@Param("account")String account);

  Role queryRoleByUserId(@Param("userId")Integer userId);

  User queryByAccount(@Param("account")String account);

}