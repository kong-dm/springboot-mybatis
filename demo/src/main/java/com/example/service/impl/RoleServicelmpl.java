package com.example.service.impl;

import com.example.dao.RoleMapper;
import com.example.pojo.Role;
import com.example.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author kdm
 * @date 2019/8/3 8:42
 */
public class RoleServicelmpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper;


    @Override
    public List<Role> queryRoleById(Integer id) {
        return null;
    }
}
