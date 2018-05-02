package com.test.model;

import java.io.Serializable;

/**
 * Created by ZFK on 2018/4/21.
 */
public class User implements Serializable {
    private String loginname;
    private String username;
    private String password;
    public void setLoginame(String loginname) {
        this.loginname = loginname;
    }
    public String getLoginame() {
        return loginname;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getUsername() {
        return username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return password;
    }
}
