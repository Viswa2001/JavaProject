/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import java.io.*;
import java.sql.*;
public class Display {
    public void Disp() throws IOException{
       
        
                 try {
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","12345678");
                    Statement stmt = con.createStatement();
                    
                      
                    
                    for(int f=1;f<100;f++){
                    String q1 = "select * from products where ProductID='"+f+"'";
                    ResultSet x = stmt.executeQuery(q1);
                    if(x.next()){
                        
                        System.out.println("Product ID    : " + x.getInt("ProductID"));
                        System.out.println("Product Name  : " + x.getString("ProductName"));
                        System.out.println("Seller Name: " + x.getString("seller"));
                        System.out.println("Price      : " + x.getFloat("price"));
                        System.out.println("Quantity     : " + x.getInt("Quantity"));
                                          
                    }
                    
                    }
                }
                catch(ClassNotFoundException | SQLException e) {
                    e.getMessage();
                }
        
    }
    
    }

