/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import java.io.*;
import java.sql.*;

public class Login {
      public static int login() throws IOException {
            DataInputStream ds=new DataInputStream(System.in);
     
     System.out.println("-----------------");
      System.out.println("Username :");
      String username= ds.readLine();
      System.out.println("Password :");
      String password=ds.readLine();
     
     
     try{
  
         Class.forName("oracle.jdbc.driver.OracleDriver");
            try (Connection con = DriverManager.getConnection
        ("jdbc:oracle:thin:@localhost:1521:XE","system","12345678")){
              
         Statement stmt=con.createStatement();
         String q1=" select * from login ";
        ResultSet rs=stmt.executeQuery(q1);
       if(rs.next()){
         
        if(username.equals(rs.getString("username")) ){
            if(password.equals(rs.getString("password"))){
             System.out.println("Login success");
             System.out.println("-----------------");
               return 1;
            
            }
            
          }
        System.out.println("-----------------");
       }
        
            }
     
     }catch(ClassNotFoundException | SQLException e){
        System.out.println(e);
     }
          return 0;
 }
}
