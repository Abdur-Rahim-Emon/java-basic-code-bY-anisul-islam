import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Client> clients = new ArrayList<>();
        ArrayList<Car> cars = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        while (check) {
            System.out.println("            Welcome to the Car Rental Service! \n\n");
            System.out.println("1: Add a new Car to the system.");
            System.out.println("2: Add a client to the system.");
            System.out.println("3: See all the cars in the system.");
            System.out.println("4: See all the clients in the system.");
            System.out.println("5: Delete a car from the system.");
            System.out.println("6: Remove a client from the system.");
            System.out.println("7: Renting car : ");
            System.out.println("8: Return your car : ");
            System.out.println("9: Exit.");
            System.out.println("10: Change client password.");
            System.out.println("Enter the amentioned values to do the respective tasks.");

            int c = sc.nextInt();
            switch (c) {
                case 1: {
                    System.out.println("Adding a new Car to the system.");
                    addCar(cars);
                    break;
                }
                case 2: {
                    System.out.println("Adding a client to the system.");
                    addClient(clients);
                    break;
                }
                case 3: {
                    System.out.println("See all the cars in the system.");
                    for (Car car : cars)
                        car.displayInfo();
                    break;
                }
                case 4: {
                    System.out.println("See all the clients in the system.");
                    for (Client client : clients)
                        client.displayInfo();
                    break;
                }
                case 5: {
                    System.out.println("Delete a car from the system.");
                    System.out.print("Enter the index of the car : ");
                    int carIndex = sc.nextInt();
                    cars.remove(carIndex);
                    break;
                }
                case 6: {
                    System.out.println("Remove a client from the system.");
                    System.out.print("Enter the index of the client : ");
                    int clientIndex = sc.nextInt();
                    clients.remove(clientIndex);
                    break;
                }
                case 7: {
                    System.out.println("Renting car : ");
                    System.out.println("See all the available cars in the system.");
                    for (Car car : cars) {
                        if (car.availability == true) {
                            int index = cars.indexOf(car);
                            System.out.println("Index of the car : " + index);
                            car.displayInfo();
                            System.out.println("Now Rent a car with index : ");
                            System.out.print("Enter the index of the car : ");
                            int carIndex = sc.nextInt();
                            if (cars.get(carIndex).availability == true) {
                                cars.get(carIndex).displayInfo();
                                System.out.print("Enter your Client Index : ");
                                int clientIndex = sc.nextInt();
                                System.out.print("Enter your password : ");
                                String password = sc.next();
                                if (clients.get(clientIndex).clientRentStatus == false && clients.get(clientIndex).checkPassword(password) == true) {
                                    //Calculating Rent
                                    System.out.println("Enter the amount of time you want to rent the car (hour) : ");
                                    int time = sc.nextInt();
                                    double rentCost = time * cars.get(carIndex).rentPerHour;
                                    System.out.println("Your rent is : " + rentCost);
                                    System.out.println("Follow the below procedure to pay.");
                                    clients.get(clientIndex).clientRentStatus = true;
                                    cars.get(carIndex).availability = false;
                                    clients.get(clientIndex).setHistory(carIndex);

                                } else
                                    System.out.println("Client rent status/password wrong! Please provide correct information!");
                            } else System.out.println("Car not available.");

                        }
                    }
                    break;
                }
                case 8: {
                    System.out.println("Return your car : ");
                    System.out.print("Enter your Client Index : ");
                    int clientIndex = sc.nextInt();
                    if (clients.get(clientIndex).clientRentStatus == true) {
                        System.out.print("Enter the index of the car : ");
                        int carIndex = sc.nextInt();
                        if (cars.get(carIndex).availability == false && cars.get(clientIndex).renterIndex == clientIndex) {
                            cars.get(carIndex).availability = true;
                            clients.get(clientIndex).clientRentStatus = false;
                        } else System.out.println("Wrong input. You didn't rent this car.");
                    } else System.out.println("You didn't rent a car.");
                    break;
                }
                case 9: {
                    System.out.println("Exiting the system.");
                    check = false;
                }
                default:
                    System.out.println("Wrong input. Please try again.");
            }
        }
    }
    public static void addCar(ArrayList<Car> cars) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the car: ");
        String carName = sc.nextLine();
        System.out.print("Enter the type of the car: ");
        String carType = sc.nextLine();
        System.out.print("Enter the color of the car: ");
        String carColor = sc.nextLine();
        System.out.print("Enter the current location of the car: ");
        String currentLocation = sc.nextLine();
        System.out.print("Enter the license number of the car: ");
        long licenseNumber = sc.nextLong();
        System.out.print("Enter the rent (per hour) of the car: ");
        int rentHour = sc.nextInt();
        cars.add(new Car(carName,carType,carColor,licenseNumber,currentLocation,rentHour));
        System.out.println("Car added successfully.");
        System.out.println("Index of the car : "+(cars.get(cars.size()-1)));
        System.out.println("Remember the index of the car to access the system.");
    }
    public static void addClient(ArrayList<Client> clients) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the client: ");
        String clientName = sc.nextLine();
        System.out.print("Enter the address of the client: ");
        String clientAddress = sc.nextLine();
        System.out.print("Enter the phone number of the client: ");
        long phoneNumber = sc.nextLong();
        System.out.print("Enter the license number of the client: ");
        long licenseNumber = sc.nextLong();
        System.out.print("Enter the NID of the client: ");
        long nid = sc.nextLong();
        System.out.print("Enter your password : ");
        String password = sc.nextLine();
        clients.add(new Client(clientName,clientAddress,phoneNumber,licenseNumber,nid,password));
        System.out.println("Congratulations! You are added to the system.");
        System.out.println("Your Client Index is : "+(clients.get(clients.size()-1)));
        System.out.println("Remember the Client Index to access the system.");
    }


}