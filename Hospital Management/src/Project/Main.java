package Project;

import java.util.Scanner;

public class Main {
   static void  mainMenu(){
        System.out.println("WELCOME TO HOSPITAL MANAGEMENT SYSTEM");
        System.out.println("1.Admin");
        System.out.println("2.User");
    }
    static void  adminMenu(){
        System.out.println("1.Add Doctor");
        System.out.println("2.Delete Doctor");
        System.out.println("3.Main Menu");
        System.out.println("4.Exist(0)");
    }
    static void  userMenu(){
       System.out.println("1. Add Patient");
       System.out.println("2. Book Appointment");
       System.out.println("3. View Doctor");
       System.out.println("4. View Patient");
       System.out.println("5. Main Menu");
       System.out.println("6. Exit(0)");


    }

    public static void main(String[] args) {
       mainMenu();
      int choice=1;
      int userChoice=1;
      int adminChoice=1;
      String password="sdf";
      boolean access=false;
        Scanner in=new Scanner(System.in);

       while(choice!=0){
           choice=in.nextInt();
           switch(choice){
               case 1:
               {
                   while(userChoice!=0) {
                       System.out.println("Welcome to Admin Menu ");
                       adminMenu();
                       userChoice=in.nextInt();
                       switch(userChoice){
                           case 1:
                               
                       }


                   }

                  break;
               }
               case 2:
               {
                   System.out.println("WELCOME TO USER SYSTEM");
                   userMenu();
                   while(userChoice!=0){
                       userChoice=in.nextInt();
                       switch(userChoice){
                           case 1:{
                               break;
                           }
                           case 2:{
                               break;
                           }
                           case 3:{
                               break;
                           }
                           case 4:{
                               break;
                           }
                           case 5:{
                               break;
                           }
                           case 6:{
                               break;
                           }

                       }
                   }


                   break;
               }

           }

       }

    }
}
