package com.music.service;

import java.util.List;

import com.music.domain.User;
import com.music.util.DBUtils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 用户服务类
 * @author www.shiyanlou.com
 *
 */
public class UserService {
    /**
     * 通过用户名获取用户
     * @param username 用户名
     * @return 用户
     */
    public User getUserByUsername(String username) {
        String sql = "select id, username, password from user where username = ?";
        String[] parameters = {username};
        List<Object[]> users = DBUtils.query(sql, parameters);
        if (users.size() == 0) {
            return null;
        } else {
            Object[] objects = users.get(0);
            return objects == null ? null : new User(Integer.parseInt(objects[0].toString()), objects[1].toString(), objects[2].toString());
        }
    }

    /**
     * 添加用户
     * @param user 用户
     */
    public void addUser(String a, String b) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
         Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/music","root","xd970902");
         Statement statement = connection.createStatement();
         int count=1;
         ResultSet rs = statement.executeQuery("select * from user");
         while (rs.next())
          {
               count++;
           }
           statement.execute("insert into user(id,username,password) values('"+count+"','"+a+"','"+b+"')");
    }
}