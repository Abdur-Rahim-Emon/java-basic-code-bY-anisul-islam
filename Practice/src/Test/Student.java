package Test;
import Universel.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class Student {
    public static void main(String[] args) {

        int id;
        String name;
        String fname;
        String mname;
        String email;
        String password;

        Scanner in=new Scanner(System.in);
        System.out.println("enter your id : ");
        id=in.nextInt();
        in.nextLine();
        System.out.println("enter your name : ");
        name=in.next();
        System.out.println("enter your fname : ");
        fname=in.next();
        System.out.println("enter your mname : ");
        mname=in.next();
        System.out.println("enter your email : ");
        email=in.next();
        System.out.println("enter your password : ");
        password=in.next();

        universel u = new universel();
        try{
             String query="insert into university.student (id,name,fname,mname,email,password) values ('"+id+"','"+name+"','"+fname+"', '"+mname+"','"+email+"','"+password+"')";
             u.st.executeUpdate(query);

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
       try {
           u.st.close();
       }
       catch(Exception e){
           System.out.println(e.getMessage());
       }
    }
}
