package Test;
import Universel.*;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Scanner;

public class Teacher {
    public static void main(String[] args) {
        universel un=new universel();
        int id;
        String tname;
        double salary;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter id:");
        id=in.nextInt();
        in.nextLine();
        System.out.println("Enter name:");
        tname=in.next();
        System.out.println("Enter salary:");
        salary=in.nextDouble();
        try{
            String query2="insert into university.teacher (id,tname,salary) values('"+id+"','"+tname+"','"+salary+"')";
                    un.st.executeUpdate(query2);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        try {
            ResultSet rs = un.st.executeQuery("select * from university.teacher");
            ResultSetMetaData rsmd=rs.getMetaData();
            int count=rsmd.getColumnCount();
            for (int i = 1; i <= count; i++) {
                System.out.print(rsmd.getColumnName(i)+"\t");
            }
            System.out.println();
            while(rs.next()){
                System.out.println(rs.getInt("id")+" "+rs.getString("tname")+" "+rs.getDouble("salary"));

            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        try{
            un.st.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }




    }
}
