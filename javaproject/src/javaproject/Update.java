/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;
import java.io.*;
import java.sql.*;
/**
 *
 * @author Viswa
 */
public class Update {
    
    public void Updation() throws IOException{
        int w=0;
         DataInputStream ds=new DataInputStream(System.in);
                 do{
                     System.out.println("What do you want to update :\n1.ProductID\n2.Product name\n3.Seller name\n4.Price\n5.Quantity\n6.Quit");
                 w=Integer.parseInt(ds.readLine());
                 switch(w){
                     case 1:try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
            try (Connection con = DriverManager.getConnection
        ("jdbc:oracle:thin:@localhost:1521:XE","system","12345678")) {
                System.out.println("Updated ProductID");
                int id=Integer.parseInt(ds.readLine());
                
                System.out.println("Enter the name of the product");
                String prname=ds.readLine();
                Statement stmt=con.createStatement();
                String q1=
                       " update products set ProductID ='"+id+"'where ProductName='"+prname+"'";
                        
                int x=stmt.executeUpdate(q1);
                if(x>0)
                {
                    System.out.println("updated successfully");
                }
                else
                {
                    System.out.println("couldn't update");
}           }
}
catch(  ClassNotFoundException | SQLException | IOException e)
{
System.out.println(e);
}
                    
                    break;
                     case 2:try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
            try (Connection con = DriverManager.getConnection
        ("jdbc:oracle:thin:@localhost:1521:XE","system","12345678")) {
                System.out.println("Enter the ProductID");
                int id=Integer.parseInt(ds.readLine());
                System.out.println("updated Product Name");
                String prname=ds.readLine();
                
            
                
                Statement stmt=con.createStatement();
                String q1=
                       " update products set ProductName ='"+prname+"'where ProductID='"+id+"'";
                        
                int x=stmt.executeUpdate(q1);
                if(x>0)
                {
                    System.out.println("updated successfully");
                }
                else
                {
                    System.out.println("couldn't update");
}           }
}
catch(  ClassNotFoundException | SQLException | IOException e)
{
System.out.println(e);
}
                     break;
                     case 3:try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
            try (Connection con = DriverManager.getConnection
        ("jdbc:oracle:thin:@localhost:1521:XE","system","12345678")) {
                System.out.println("updated seller Name");
                String sname=ds.readLine();
                
                System.out.println("Enter the name of the product");
                String prname=ds.readLine();
                Statement stmt=con.createStatement();
                String q1=
                       " update products set seller ='"+sname+"'where ProductName='"+prname+"'";
                        
                int x=stmt.executeUpdate(q1);
                if(x>0)
                {
                    System.out.println("updated successfully");
                }
                else
                {
                    System.out.println("couldn't update");
}           }
}
catch(  ClassNotFoundException | SQLException | IOException e)
{
System.out.println(e);
}
                    
                    break;
                     case 4:try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
            try (Connection con = DriverManager.getConnection
        ("jdbc:oracle:thin:@localhost:1521:XE","system","12345678")) {
                System.out.println("updated Price");
                float p=Float.parseFloat(ds.readLine());
                
                System.out.println("Enter the name of the product");
                String prname=ds.readLine();
                Statement stmt=con.createStatement();
                String q1=
                       " update products set price ='"+p+"'where ProductName='"+prname+"'";
                        
                int x=stmt.executeUpdate(q1);
                if(x>0)
                {
                    System.out.println("updated successfully");
                }
                else
                {
                    System.out.println("couldn't update");
}           }
}
catch(  ClassNotFoundException | SQLException | IOException e)
{
System.out.println(e);
}
                    
                    break;
                     case 5:
                         try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
            try (Connection con = DriverManager.getConnection
        ("jdbc:oracle:thin:@localhost:1521:XE","system","12345678")) {
                System.out.println("updated Quantity");
                int Qt=Integer.parseInt(ds.readLine());
                
                System.out.println("Enter the name of the product");
                String prname=ds.readLine();
                Statement stmt=con.createStatement();
                String q1=
                       " update products set Quantity='"+Qt+"'where ProductName='"+prname+"'";
                        
                int x=stmt.executeUpdate(q1);
                if(x>0)
                {
                    System.out.println("updated successfully");
                }
                else
                {
                    System.out.println("couldn't update");
}           }
}
catch(  ClassNotFoundException | SQLException | IOException e)
{
System.out.println(e);
}
                    
                    break;                
                         
                 }
                 }while(w!=6);
                    
    }
    
}
