package Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionDatabase {
    public java.sql.Connection conection;

    public Statement statement;
    final   String url="jdbc:mysql://127.0.0.1/test";
    final String username="root";
    final String password="588342";

    public ConnectionDatabase() {
        try {
            conection = DriverManager.getConnection(url,username,password);
            statement = conection.createStatement();
        }catch(SQLException e) {
           throw new RuntimeException(e);
        }
    }
}
