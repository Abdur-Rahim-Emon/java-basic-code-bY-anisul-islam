package DataBase;

import java.sql.*;

public class Data_Base_Connection {
   public static final String url="jdbc:mysql://localhost:3306/my_data_base";
   public static final String user="root";
   public static final String password="588342";
   public Connection connection;
  public Statement statement;
    public Data_Base_Connection(){
        try{
            connection=DriverManager.getConnection(url,user,password);
            statement= connection.createStatement();
        }
        catch (Exception e){
            System.out.println(e);
        }


    }



}
