
package Superclass;
class Bike{
    String c;
    int weight;
    Bike(String c,int w){
        this.c=c;
        weight=w;
    }
    void show(){
        System.out.println("colour : "+c);
        System.out.println("Weight : "+weight);
    }
    
}
class Car extends Bike {
    int g;
    Car(String c, int w,int g){
        super(c,w);
        this.g=g;
    }
    @Override
    void show(){
        super.show();
        System.out.println("gear i : "+g);
        
    }
    
    
    
}
public class P4 {
    public static void main(String[] args) {
        Car d1=new Car("white ",3333,5);
        d1.show();
        System.out.println("bike information ");
        Bike d2=new Bike("red",333);
        d2.show();
    }
    
    
}
