package com.example.pojo;

import java.io.Serializable;

public class RoleResource implements Serializable {
  private Integer rrId;

  private Integer roleId;

  private Integer resId;

  public Integer getRrId() {
      return rrId;
   }

 public void setRrId(Integer rrId) {
       this.rrId = rrId;
   }

    public Integer getRoleId() {
       return roleId;
    }

  public void setRoleId(Integer roleId) {
      this.roleId = roleId;
  }

    public Integer getResId() {
       return resId;
   }

    public void setResId(Integer resId) {
       this.resId = resId;
    }
}