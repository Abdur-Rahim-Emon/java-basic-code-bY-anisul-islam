
package CarRental;

public class CarDetails {   
   private String carname,carmodel;
    //static String carshowrum="Dhaka";
    private double carprice;
    private boolean carstatus=true;
    CarDetails(String carname,String carmodel,double carprice){
        this.carmodel=carmodel;
        this.carname=carname;
        this.carprice=carprice;
    }
   void setCarame(String carname){
       this.carname=carname;
         
    }
   void setcarmodel(String carmodel){
       this.carmodel=carmodel;
   }
   void setCarStatus(boolean carstatus){
        this.carstatus=carstatus;
   }
   String getcarname(){
       return carname;
   }
   String getcarmodel(){
       return carmodel;
   }
   void setCarprice(double carprice){
        this.carprice=carprice;
   }
   double getCarprice(){
        return carprice;
   }
   boolean getCarstatus(){
        return carstatus;

   }
   String getCaravailabity(){
        if(carstatus){
            return "Available";
        }
        else{
            return "Not Available";
        }
   }
   public String toString(){
       return "Car name :  "+carname+"  Car model : "+carmodel+"  Car price : "+carprice +"  Car status : "+getCaravailabity();
   }
}



