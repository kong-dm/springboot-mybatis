package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kdm
 * @date 2019/8/2 15:30
 */
@RestController
public class TsetController {

//  @GetMapping("admin/home")
    @RequestMapping("admin/home")
    @ResponseBody
  public  Object home(){

      return "hello,springboot!";
   }


}
