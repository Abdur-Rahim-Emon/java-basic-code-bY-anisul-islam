public class Car {
    String carName;
    String carType;
    String carColor;
    long carLicence;
    String carCurrentLocation;
    double rentPerHour;
    Boolean availability = true;
    int renterIndex;

    Car(String car_name, String car_type, String car_color, long licence, String current_location,double rent_per_hour) {
        this.carName = car_name;
        this.carType = car_type;
        this.carColor = car_color;
        this.carLicence = licence;
        this.carCurrentLocation = current_location;
        this.rentPerHour = rent_per_hour;
    }
    public void changeLocation(String current_location) {
        this.carCurrentLocation = current_location;
    }
    public void setForRent(int renterIndex) {
        this.renterIndex = renterIndex;
        this.availability = false;
    }
    public void displayInfo() {
        System.out.println("Car Name: " + this.carName);
        System.out.println("Car Type: " + this.carType);
        System.out.println("Car Color: " + this.carColor);
        System.out.println("Car Licence: " + this.carLicence);
        System.out.println("Car Current Location: " + this.carCurrentLocation);
        System.out.println("Rent per hour: " + this.rentPerHour);
        System.out.println("Availability: " + this.availability);
    }
}