
package CarRental;

import java.sql.SQLOutput;
import java.util.*;

public class Main {
    static void mainMenu(){
        System.out.println("*******Welcome to Car Rental System ***************");
        System.out.println("** 1.Show Car Details      2.Add Car             **");
        System.out.println("** 3.Rent Car              4.Return Car          **");
        System.out.println("** 5.Show Customer Details 6.Show Rental History **");
        System.out.println("** 7.Remove Car Permently  8.Exit(0)             **");
        System.out.println("***************Enter YOUr Choice ******************");
        System.out.println("***************************************************");
    }
    public static void main(String[] args) {
        
        CarRentalSystem r=new CarRentalSystem();
        Customer customer;
        r.addcar();
        Scanner in = new Scanner(System.in);

        mainMenu();
        int  choice=1;
        while(choice!=0){

            choice=in.nextInt();

                switch (choice) {
                    case 1: {
                        r.Show();
                        System.out.println("*** Sucessfully Show the Car List ***");
                        mainMenu();
                        break;
                    }
                    case 2: {
                        System.out.println("*** Please provide Car Information ***");
                        System.out.print("Enter Car Name : ");
                        String carName = in.next();
                        System.out.print("Enter Car Model: ");
                        String carModel = in.next();
                        System.out.print("Enter Car Rent price : ");
                        double carRentPrice = in.nextDouble();
                        CarDetails car = new CarDetails(carName, carModel, carRentPrice);
                        r.addCar(car);
                        System.out.println("Sucessfully add new Car ");

                        mainMenu();
                        break;
                    }
                    case 3: {

                        System.out.print("enter Car the model : ");
                        int model = in.nextInt();
                        r.rentCarStatus(model);
                        System.out.println("Car Rent Successfully");
                        mainMenu();
                        break;
                    }
                    case 4: {
                        System.out.print("Please Enter car model : ");
                        int carModel = in.nextInt();
                        r.changeCarStatus(carModel);
                        mainMenu();
                        break;
                    }
                    case 5: {
                        r.showCustomer();
                        System.out.println("*** Sucessfully Show The Customer Details ***");
                        mainMenu();
                        break;
                    }
                    case 6: {
                        r.showRentalHistory();
                        System.out.println("*** Sucessfully Show The Rental Details ***");
                        mainMenu();
                        break;
                    }
                    case 7:
                    {
                        System.out.println("Enter Car Model ; ");
                        int carModel = in.nextInt();
                        r.removeCar(carModel);
                        System.out.println("Car Remove Successfully ");
                        mainMenu();
                        break;
                    }
                    default: {
                        System.out.println("Enter valid option ");
                        mainMenu();
                        break;
                    }
                }


        }
    }
}
