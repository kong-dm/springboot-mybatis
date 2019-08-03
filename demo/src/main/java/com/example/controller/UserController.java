package com.example.controller;

import com.example.common.Lestutil;
import com.example.common.Response;
import com.example.common.StatusCode;
import com.example.dto.UserDTO;
import com.example.pojo.User;
import com.example.service.UserService;
import com.example.session.UserSession;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author kdm
 * @date 2019/8/2 15:56
 */
@RestController
public class UserController {

    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService service;

   @PostMapping("admin/sing-in")
   public Response login(HttpServletRequest request, @RequestBody UserDTO userDTO){
       log.info("UserDTO:"+userDTO.getAccount()+","+userDTO.getPassword());
       User user=service.queryUserAccount(userDTO.getAccount());
       if(StringUtils.isEmpty(userDTO.getAccount())){
           return new Response<>(StatusCode.ERROR, "用户名不能为空");
       }
       if(StringUtils.isEmpty(userDTO.getPassword())){
           return new Response<>(StatusCode.ERROR, "密码不能为空");
       }
       if(user.getStatus()==false){
          return new Response<>(StatusCode.ERROR, "用户已锁定");
       }
       if(user.getPassword().equals(Lestutil.letterDigit(userDTO.getPassword()))){
           return new Response<>(StatusCode.ERROR, "密码错误");
       }
       UserSession userSession=new UserSession();
       userSession.setUserId(user.getUserId());
       userSession.setUserName(user.getUserName());
       userSession.setAccount(user.getAccount());
       userSession.setPassword(user.getPassword());
       HttpSession session=request.getSession();
       session.setAttribute("session",userSession);
       return new Response(StatusCode.SUCCESS,"成功",session.getAttribute("session"));
   }








    @GetMapping("admin/user")
    public Response<User> user(@RequestParam("id") Integer id){
        User user=service.queryUserById(id);
        if(user!=null){
            return new Response<>(StatusCode.SUCCESS, "成功",user);
        }
            return new Response<>(StatusCode.ERROR, "没有数据");
    }





}
