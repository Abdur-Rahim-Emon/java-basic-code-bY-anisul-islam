package Universel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class universel {
    java.sql.Connection con;
  static final  String url="jdbc:mysql://127.0.0.1/university";
 static final String username="root";
  static final String password="588342";
    public Statement st;
  public universel() {
        try {
            con = DriverManager.getConnection(url, username, password);
            st = con.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
