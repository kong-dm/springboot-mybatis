package com.example.service;

import com.example.pojo.Role;

import java.util.List;

/**
 * @author kdm
 * @date 2019/8/3 6:05
 * 角色
 */
public interface RoleService {
    /**
     * 根据用户id查询所有的角色信息
     * @param id
     * @return
     */
    List<Role> queryRoleById(Integer id);


}
