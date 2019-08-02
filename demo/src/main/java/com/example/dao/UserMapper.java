package com.example.dao;


import com.example.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
  User selectUserById(@Param("id") Integer id);
}