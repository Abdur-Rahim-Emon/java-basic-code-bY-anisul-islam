package CarRental;

public class Customer {
    private String cname,cphone,caddress;
    private double taka,hour;
    Customer(String cname,String caddress,String cphone,double hour ){
        this.cname=cname;
        this.caddress=caddress;
        this.cphone=cphone;
        this.hour=hour;
    }
    void setCname(){
        this.cname=cname;
    }
    void setCaddress(){
        this.caddress=caddress;
        
    }
    void setCphone(){
        this.cphone=cphone;
    }
    void setHour(){
        this.hour=hour;
    }
    void setTaka(double taka){
        this.taka=taka;
    }
    String getCname(){
        return cname;
    }
    String getCaddress(){
        return caddress;
    }
    
   String getCphone(){
       return cphone;
   }
   double getTaka(){
       return taka*hour;
   }
    @Override
   public String toString(){
       return "Customer name : "+cname+" Adress : "+caddress+" Phone number : "+cphone+" Total Bill : "+getTaka();
   }

}
