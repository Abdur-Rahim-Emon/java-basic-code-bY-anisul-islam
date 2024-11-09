package Project;

import java.sql.*;
import java.util.Scanner;

import DataBase.*;
public class Patient extends Person{
    Data_Base_Connection con;
    Patient(){
 con=new Data_Base_Connection();
    }
    String gender;
    String name;
    int age;
    int doctor_id;
    String diseases;
   void takeData(String name,int old){}
    void takeData(String name,int age,String gender,String diseases,int doctor_id){
       this.name=name;
       this.age=age;
       this.gender=gender;
       this.diseases=diseases;
       this.doctor_id=doctor_id;
       setData();

    }
    void setData(){

          try {
              String query="insert into patient(name,age,gender,diseases,doctor_id) values('"+name+"','"+age+"','"+gender+"','"+diseases+"','"+doctor_id+"')";
             /* PreparedStatement ps = con.connection.prepareStatement(query);
              ps.setString(1,name);
              ps.setInt(2,age);
              ps.setString(3,gender);
              ps.setString(4,diseases);
              ps.setInt(5,doctor_id);*/
              con.statement.executeUpdate(query);

          }catch (SQLException e){
              e.printStackTrace();
          }

    }
    void viewPatientData(){
        try{
            ResultSet resultSet=con.statement.executeQuery("select * from my_data_base.patient;");
            ResultSetMetaData metaData=resultSet.getMetaData();
            int columnCount=metaData.getColumnCount();
            for(int i=1; i<=columnCount; i++){
                System.out.print(metaData.getColumnName(i)+"\t\t");
            }

            System.out.println("patient details ");
            System.out.println("+--------+---------------------------+--------------+---------------+------------------+------------------+");
            System.out.println("|  id    |     patient name          | patient age  | patient gender| patient diseases | patient doctor id|");
            System.out.println("+--------+---------------------------+--------------+---------------+------------------+------------------+");
            while(resultSet.next()){
                int id=resultSet.getInt("id");
                String name=resultSet.getString("name");
                int age=resultSet.getInt("age");
                String gender=resultSet.getString("gender");
                String diseases=resultSet.getString("diseases");
                int doctor_id=resultSet.getInt("doctor_id");
               // System.out.print("| %-8s | %-25s | %-13s | %-15s | %-18s | %-18s |\n",id,name,age,gender,diseases,doctor_id);
                System.out.printf("|%-8d| %-25s |%-13d|%-15s|%-18s|%-18d|\n",id,name,age,gender,diseases,doctor_id);
                System.out.println("+--------+---------------------------+--------------+---------------+------------------+------------------+");

            }

        }
        catch (Exception e){
            System.out.println(e);
        }


    }
    public static void main(String[] args){
        Patient p=new Patient();
        /*Scanner in =new Scanner(System.in);
        String name;
        int age;
        String gender;
        String diseases;
        int doctor_id;
        System.out.println("enter name of patient ");
        name=in.nextLine();
        System.out.println("enter age of patient ");
        age=in.nextInt();
        System.out.println("enter gender of patient ");
        gender=in.next();
        System.out.println("enter diseases name of patient ");
        diseases=in.next();
        System.out.println("enter doctor id of patient ");
        doctor_id=in.nextInt();
        p.takeData(name,age,gender,diseases,doctor_id);*/
        p.viewPatientData();
    }

}
