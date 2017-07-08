package com.music.domain;

import java.io.Serializable;
import java.util.List;

/**
 * 用户类
 * @author www.shiyanlou.com
 *
 */
@SuppressWarnings("serial")
public class User implements Serializable {
    private int id;    //用户ID
    private String username;    //用户名
    private String password;    //密码

    public User() {
    }
    
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(int id,String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public User(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}