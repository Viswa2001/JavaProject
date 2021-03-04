/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;
import java.io.*;
import java.sql.*;
public class Purchase {
    public void Buy() throws IOException{
        float total=0;
        int j=0,g=0;
        DataInputStream ds=new DataInputStream(System.in);
        System.out.println("would you like to: \n1.Display products in database\n2.Search by ");
                  int b=Integer.parseInt(ds.readLine());
                    switch(b){
                        case 1:try {
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
                    do{
                    System.out.println("Enter the name of the product you want to purchase :");
                    String product_name=ds.readLine();
                    System.out.println("Required Quantity :");
                    int cp=Integer.parseInt(ds.readLine());
                    Statement stmt1 = con.createStatement();
                    String q2 ="select * from products where ProductName='"+product_name+"'";
                    ResultSet rs = stmt.executeQuery(q2);
                    if(rs.next()){
                        if(cp<=rs.getInt("Quantity")){
                            float z=rs.getFloat("Price")*cp;
                            total=total+z;
                          
                        }
                        System.out.println("Would you like to purchase more Quantity :\n1.Yes\n2.No");
                        j=Integer.parseInt(ds.readLine());
                            if(j==2){
                            System.out.println("---------------------------------------");   
                            System.out.println("Total amount including taxes :"+total);
                            System.out.println("---------------------------------------");  
                            total=0;
                        }
                        
                    }
                     }while(j!=2);
                }
                   
                catch(ClassNotFoundException | SQLException e) {
                    e.getMessage();
                }
                        break;
                        case 2:do{
                                 System.out.println("Select a search method: \n1.Product name\n2.Seller name\n3.Quit");
                                g=Integer.parseInt(ds.readLine());
                                switch(g){
                                    case 1:try {
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","12345678");
                   do{
                    System.out.println("Enter the name of the product you want to purchase :");
                    String product_name=ds.readLine();
                    System.out.println("Required Quantity  :");
                    int cp=Integer.parseInt(ds.readLine());
                    Statement stmt1 = con.createStatement();
                    String q2 ="select * from products where ProductName='"+product_name+"'";
                    ResultSet rs = stmt1.executeQuery(q2);
                    if(rs.next()){
                        if(cp<=rs.getInt("Quantity")){
                            float z=rs.getFloat("Price")*cp;
                            total=total+z;
                          
                        }
                        System.out.println("Would you like to purchase more Quantity :\n1.Yes\n2.No");
                        j=Integer.parseInt(ds.readLine());
                            if(j==2){
                            System.out.println("---------------------------------------");   
                            System.out.println("Total amount including taxes :"+total);
                            System.out.println("---------------------------------------");  
                            total=0;
                        }
                        
                    }
                     }while(j!=2);
                }
                   
                catch(ClassNotFoundException | SQLException e) {
                    e.getMessage();
                }
                                    break;
                                    case 2:try {
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","12345678");
                   do{
                    System.out.println("Enter the name of the Seller  :");
                    String seller_b=ds.readLine();
                    System.out.println("Products available :");
                    for(int f=0;f<100;f++){
                    Statement stmt =con.createStatement();
                    String q1="select * from products where seller='"+seller_b+"' and ProductID='"+f+"'";
                    ResultSet rs1 = stmt.executeQuery(q1);
                    if(rs1.next()){
                   
                       System.out.println("-"+rs1.getString("ProductName"));
                    }
                    }
                 System.out.println("Enter the name of the product  :");
                   String product_name=ds.readLine();
                    System.out.println("Required Quantity  :");
                   int cp=Integer.parseInt(ds.readLine());
                   
                   Statement stmt1 = con.createStatement();
                   String q2 ="select * from products where ProductName='"+product_name+"'";
                   ResultSet rs = stmt1.executeQuery(q2);
                   if(rs.next()){
                       if(cp<=rs.getInt("Quantity")){
                          float z=rs.getFloat("Price")*cp;
                            total=total+z;
                         
                        }
                       System.out.println("Would you like to purchase more products :\n1.Yes\n2.No");
                        j=Integer.parseInt(ds.readLine());
                            if(j==2){
                            System.out.println("---------------------------------------");   
                           System.out.println("Total amount including taxes :"+total);
                            System.out.println("---------------------------------------");  
                           total=0;
                       }
                       
                   }
                    
                     }while(j!=2);
                   
                }
                   
                catch(ClassNotFoundException | SQLException e) {
                    e.getMessage();
                }
                                      break;
                                }
                        }while(g!=3);
                            
                    }
    }
    
}
