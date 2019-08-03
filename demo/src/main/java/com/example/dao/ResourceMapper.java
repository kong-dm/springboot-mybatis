package com.example.dao;


import com.example.pojo.Resources;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ResourceMapper {

    List<Resources> selectResourceAll();

    List<Resources> queryResourceByAccount(@Param("account")String account);



}