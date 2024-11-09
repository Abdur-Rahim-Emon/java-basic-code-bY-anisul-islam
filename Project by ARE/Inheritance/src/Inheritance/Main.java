package Inheritance;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void mainMenu(){
        System.out.println("1.Add Teacaher Details ");
        System.out.println("2.Add Student Details ");
        System.out.println("3.show teacher details ");
        System.out.println("4.show student details ");
        System.out.println("5.change student details ");
        System.out.println("6.Exit(0)");
        System.out.println("Enter your choice ");
    }


    public static void main(String[] args) {
        ArrayList<Teacher> teacherList=new ArrayList<>();
        ArrayList<Student> studentList=new ArrayList<>();
        int choice=1;
        while(choice!=0){
          mainMenu();
            Scanner in=new Scanner(System.in);
            choice=in.nextInt();
            switch(choice){
                case 1:
                {
                    System.out.println("Enter Teacher name ; ");
                    String name=in.next();
                    System.out.println("Enter Teacher age ;");
                    int age=in.nextInt();
                    System.out.println("Enter Teacher address ; ");
                    String address=in.next();
                    System.out.println("Enter Teacher email ; ");
                    String email=in.next();
                    Teacher t=new Teacher(name,age,email,address);
                    teacherList.add(t);
                    mainMenu();
                    break;
                }
                case 2:{
                    System.out.println("Enter Student name ; ");
                    String name=in.next();

                    System.out.println("Enter Student age ;");
                    int age=in.nextInt();
                    System.out.println("Enter Student id ; ");
                   int id=in.nextInt();
                    System.out.println("Enter Student address ; ");
                    String adress=in.next();
                    Student s=new Student(name,id,age,adress);
                    studentList.add(s);
                    mainMenu();
                    break;

                }
                case 3:
                {
                    System.out.println("show teacher details ");
                    for(Teacher t:teacherList){
                        System.out.println(t);
                    }
                    break;
                }
                case 4:
                {
                    System.out.println("show student details ");
                    for(Student t:studentList){
                        System.out.println(t);
                    }
                    System.out.println("details show successfully ");
                    break;
                }
                case 5:
                {
                    System.out.println("enter student serial number : ");
                    int serial=in.nextInt();
                    System.out.println("enter new student name  : ");
                    String name=in.next();
                    System.out.println("enter new student age  : ");
                    int age=in.nextInt();
                    System.out.println("enter new student id  : ");
                    int id=in.nextInt();
                    System.out.println("enter new student address : ");
                    String adress=in.next();
                    studentList.get(serial-1).setId(id);
                    studentList.get(serial-1).setName(name);
                    studentList.get(serial-1).setAge(age);
                    studentList.get(serial-1).setAddress(adress);
                    break;

                }
            }
        }

    }
}
