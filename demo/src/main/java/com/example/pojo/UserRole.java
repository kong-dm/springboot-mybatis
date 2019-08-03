package com.example.pojo;

import java.io.Serializable;

public class UserRole implements Serializable {
    private Integer urId;

   private Integer userId;

   private Integer roleId;

  public Integer getUrId() {
       return urId;
   }

   public void setUrId(Integer urId) {
        this.urId = urId;
    }

   public Integer getUserId() {
       return userId;
    }

    public void setUserId(Integer userId) {
       this.userId = userId;
    }

    public Integer getRoleId() {
       return roleId;
   }

   public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}