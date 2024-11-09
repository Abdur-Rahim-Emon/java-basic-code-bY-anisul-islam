package Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
    Connection con;
    Statement st;
    private final String url = "jdbc:mysql://localhost:3306/are";
    private final String user = "root";
    private final String password = "588342";
    public Database(){
        try {
            con = DriverManager.getConnection(url,user,password);
        }catch (SQLException e){
            throw new RuntimeException("Database connection failed");
        }
        if (con!=null){
            System.out.println("Connected");
        }
    }

    public static void main(String[] args) {
        Database connection = new Database();
    }
}
