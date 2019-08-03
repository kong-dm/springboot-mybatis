package com.example.service.impl;

import com.example.demo.DemoApplication;
import com.example.pojo.Resources;
import com.example.service.ResourceService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author kdm
 * @date 2019/8/3 6:12
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class ResourceServicelmplTest {
   @Autowired
    private ResourceService resourceService;

   @Test
    public void findAll(){
       List<Resources> resources=resourceService.findAll();
       System.out.println(resources);
   }



}