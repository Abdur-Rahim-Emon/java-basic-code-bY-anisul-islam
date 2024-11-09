package CarRental;

import java.util.*;

public class CarRentalSystem {       
        // Create an ArrayList to store CarDetails objects
        private ArrayList<CarDetails> carList ;
        private String carmodel=null;
        private ArrayList<Customer> customerList;
        private ArrayList<CarDetails> removeCarList;
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<Integer> b=new ArrayList<>();
              //Customer customerBill=new Customer("","","",0.0);
        CarRentalSystem(){// initializing all the ArrayList
          carList =new ArrayList<>(); 
            customerList=new ArrayList<>();
            removeCarList=new ArrayList<>();
           
        }
    //adding car in carDeatails when running the program
        void addcar(){
            CarDetails[] C=new CarDetails[4];
        C[0]=new CarDetails("Bugatti","1",50000.0);
        C[1]=new  CarDetails("Ferrari", "2",20000.0);
        C[2]=new CarDetails("Toyota", "3",15000.0);
        C[3]=new CarDetails("Range rover", "4",40000.0);
        for(int i=0; i<4; i++){
            carList.add(C[i]);
            a.add(i);
        }
        }


    //show Car details
        void Show(){
            System.out.println("Available Car List ");
            int i=1;
            for(CarDetails car: carList) {
                System.out.println((i++)+"."+" "+car);
            }
        }
    // car add method
    void addCar(CarDetails C){// void c(int x0
        carList.add(C);
        a.add(a.size()-1);//no use in the program

    }
    // check carlist status
    void rentCarStatus(int carmodel){
        if(carList.get(carmodel-1).getCarstatus()) {
            System.out.println("This car is available for rent ");
            System.out.println("Car Rental price : "+carList.get(carmodel-1).getCarprice());
            System.out.print("Enter Customer  name  : ");
            Scanner in=new Scanner(System.in);
            String name=in.nextLine();
            System.out.print("Enter Customer adress : ");
            String adress=in.nextLine();
            System.out.print("Enter Customer phone number : ");
            String phone=in.nextLine();
            System.out.print("Enter hour for renting car : ");
            double hour=in.nextDouble();
            Customer c=new Customer(name,adress,phone,hour);
            addCustomerDetails(c,carmodel);
            removeCarList.add(carList.get(carmodel-1));
            carList.get(carmodel - 1).setCarStatus(false);
        }
        else {
            System.out.println("This car is not available for rent");
        }

    }
    // car status change
    void changeCarStatus(int carmodel){
        carList.get(carmodel-1).setCarStatus(true);
    }
    // car remove parmanently
    void removeCar(int carmodel){
            carList.remove(carmodel-1);
    }

    // add customer details
        void addCustomerDetails(Customer C,int model){
            customerList.add(C);

            customerList.get(customerList.size()-1).setTaka(  carList.get(model-1).getCarprice());

        }
    //shwo Rental history
        void showRentalHistory(){
            System.out.println("     Rental history  ");
          for(int i=0; i<customerList.size(); i++){
                System.out.println((i+1)+". "+customerList.get(i));
                System.out.println(removeCarList.get(i));
            }
        }
    //show customer details
       void showCustomer(){
            System.out.println("Customer List ");
            int i=1;
          for(Customer C: customerList){
              System.out.println((i++)+ ". " +C);

          }
       }
}
            


