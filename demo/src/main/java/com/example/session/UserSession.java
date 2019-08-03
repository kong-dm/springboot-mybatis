package com.example.session;

import java.io.Serializable;

/**
 * @author kdm
 * @date 2019/8/3 8:11
 */
public class UserSession implements Serializable {
    private Integer userId;

    private String account;

    private String password;

    private String userName;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
