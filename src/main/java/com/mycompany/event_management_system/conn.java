/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.event_management_system;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.Properties;
/**
 *
 * @author salai
 */

public class conn {
    //init database constants
    private static final String DATABASE_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/mysql";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "R$alaiM13";
    private static final String MAX_POOL = "250";

    // init connection object
    private Connection connection;
//    // init properties object
//    private Properties properties;
     Statement s;
     
     
     public conn(){
         try {
                Class.forName(DATABASE_DRIVER);
                connection = DriverManager.getConnection(DATABASE_URL, USERNAME,PASSWORD);
                s = connection.createStatement();
               String q = "select * from users where name='"+"admin"+"' and password='"+"12345"+"'";
            
            ResultSet rs = s.executeQuery(q);
            System.out.print(rs);
          } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
     }
     public static void main(String args[]){
         conn c = new conn();
     }
}