package com.example.service;

import com.example.pojo.Resources;

import java.util.List;

/**
 * @author kdm
 * @date 2019/8/3 6:04
 * 资源
 */
public interface ResourceService {

    /**
     * 获取所有的资源
     * @return
     */
    List<Resources> findAll();

    /**
     * 根据用户的id查询所有权限信息
     * @return
     */
    List<Resources> queryResourceById(Integer id);
}
