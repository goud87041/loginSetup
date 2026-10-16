package com.example.login;

import java.sql.Connection;
import java.sql.DriverManager;




public class jdbcutill{

    String url = "jdbc:mysql://localhost:3306/login";
    String user="root";
    String password="Mysql@123#$";

    public Connection getConnection(){
        try {
            return DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}