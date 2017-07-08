package com.music.test;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;  
import org.json-chargebee-1.0;
import org.json.JSONException;
import org.json.JSONObject;


public class Json { 
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String driver = "com.MySQL.jdbc.Driver";
        Class.forName("com.mysql.jdbc.Driver");
          Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/music","root","xd970902");
            String sql = "select * from songs";
            Statement statement = connection.createStatement();
            
            ResultSet rs = statement.executeQuery(sql);
            ResultSetMetaData metaData =  rs.getMetaData();  
            int columnCount= metaData.getColumnCount();   
            
            JSONArray array = new JSONArray();
            while(rs.next()){ 
             JSONObject jsonObj = new JSONObject();       
             for(int i = 1; i <= columnCount;i++)  
              {  
               String columnName = metaData.getColumnLabel(i);  
               String value =rs.getString(columnName);  
               jsonObj.put(columnName, value);  
              }  
              array.put(jsonObj);  
            }
            System.out.println("转换JSON数据：");  
            System.out.println(array.toString());  
    } 
}