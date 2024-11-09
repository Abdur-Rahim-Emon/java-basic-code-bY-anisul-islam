package InsertData;
import Connection.ConnectionDatabase;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertData {
    public static String hashPassword(String password) {
        StringBuilder sb = new StringBuilder();
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(password.getBytes());
            byte[] digest = md.digest();
            for (byte b : digest) {
                sb.append(String.format("%02x", b));
            }
        }catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        int id;
        String name;
        String fname;
        String mname;
        String email;
        String password;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the id of your student");
        id = scan.nextInt();
        scan.nextLine();
        System.out.println("enter the name of your student");
        name = scan.nextLine();
        System.out.println("enter the fname of your student");
        fname = scan.nextLine();
        System.out.println("enter the mname of your student");
        mname = scan.nextLine();
        System.out.println("enter the email of your student");
        email = scan.nextLine();
        System.out.println("enter the password of your student");
        password = scan.nextLine();

        ConnectionDatabase con = new ConnectionDatabase();
        try {
            String query = "insert into testtable (id,name,fname,mname,email,password) values (?,?,?,?,?,?)";
            PreparedStatement preparedStatement = con.conection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, fname);
            preparedStatement.setString(4, mname);
            preparedStatement.setString(5, email);
            preparedStatement.setString(6, hashPassword(password));
            preparedStatement.executeUpdate();
        }catch (Exception e) {
            System.out.println(e);
        }

    }
}
