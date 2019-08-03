package com.example.service.impl;

import com.example.dao.ResourceMapper;
import com.example.pojo.Resources;
import com.example.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author kdm
 * @date 2019/8/3 6:07
 */
@Service
public class ResourceServicelmpl implements ResourceService {
    @Autowired
    private ResourceMapper resourceMapper;

    @Override
    public List<Resources> findAll() {
        return resourceMapper.selectResourceAll();
    }

    @Override
    public List<Resources> queryResourceById(Integer id) {


        return null;
    }
}
