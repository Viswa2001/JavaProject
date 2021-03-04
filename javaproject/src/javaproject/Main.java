
package javaproject;
import java.io.*;
public class Main {    
 public static void main(String[] args)throws IOException, ClassNotFoundException{      
     int i ;
      DataInputStream ds=new DataInputStream(System.in);
       System.out.println("------WELCOME TO WATCH STORE------");
       System.out.println("1.Admin\n2.Customer");
      int vi=Integer.parseInt(ds.readLine());
      
      if(vi==1){
          System.out.println("Please verify your login address");
       if(Login.login()==1){
        do{
        System.out.println("Select Your Choice :");
        System.out.println("1.Insert Products");
        System.out.println("2.Delete Products");
        System.out.println("3.Update Products");
        System.out.println("4.Display");
        System.out.println("5.Quit");
         i=Integer.parseInt(ds.readLine());
         switch(i){
             case 1:
                 Insert in=new Insert();
                in.insertion();
                break;
             case 2:   
                 Remove re=new Remove();
                 re.delection();
                 break;
             case 3:
                 Update up=new Update();
                 up.Updation();
             break;
             case 4:
                 Display di=new Display();
                 di.Disp();
                 break;
         }
        
            }while(i != 5);
            
            }
      }else if(vi==2){
          System.out.println("Please verify your login address");
        if(Login.login()==0){
           int t;
           do{
             System.out.println("What do you want to do?");
             System.out.println("1.Purchase a product");
             System.out.println("2.Return a product");
             System.out.println("3.Quit  ");
             
             t=Integer.parseInt(ds.readLine());
             switch(t){
            case 1:
                Purchase pr=new Purchase();
                pr.Buy();
                break;
            case 2:
              
                Return rt=new Return();
                rt.ret();
                break;
                
        }
        }while(t!=3);
       }
            }

}}
         
        

