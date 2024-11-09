import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    Scanner sc = new Scanner(System.in);
    String clientName;
    String clientAddress;
    long phoneNumber;
    int clientBalance;
    long clientLicense;
    long clientNID;
    boolean clientRentStatus=false;
    private String password;
    ArrayList<Integer> history = new ArrayList<>();

    Client(String clientName, String clientAddress, long phoneNumber , long clientLicense, long clientNID, String password) {
        this.clientName = clientName;
        this.clientAddress = clientAddress;
        this.phoneNumber = phoneNumber;
        this.clientLicense = clientLicense;
        this.clientNID = clientNID;
        this.password = password;
    }
    public void setHistory(int history) {
        this.history.add(history);
    }
    public void addBalance(int balance) {
        clientBalance += balance;
    }
    public void displayInfo(){
        System.out.println("Client Name: " + clientName);
        System.out.println("Client Address: " + clientAddress);
        System.out.println("Client Phone Number: " + phoneNumber);
        System.out.println("Client License: " + clientLicense);
        System.out.println("Client NID: " + clientNID);
        System.out.println("Client Balance: " + clientBalance);

    }
    public void rent(int carIndex){
        clientRentStatus=true;
        history.add(carIndex);
    }
    public void changePassword(String password) {
        if(this.password.equals(password)) {
            this.password = sc.next();
        }
    }
    public boolean checkPassword(String password) {
        if(this.password.equals(password)) return true;
        else return false;
    }
}