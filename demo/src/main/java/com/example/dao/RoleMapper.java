package com.example.dao;


import com.example.pojo.Resources;
import com.example.pojo.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleMapper {


         Role selectRoleById(@Param("roleId") Integer roleId);

         List<Resources> queryResourceByRoleId(@Param("roleId")Integer roleId);
        }