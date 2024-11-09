
package StaticRestricton;


public class SR {
   static int x=22;
    static String name="Abdur Rahim";
    void display1(){
         System.out.println("calling non static via static");
        display2();
       
    }
    static void display2(){
        System.out.println("Name "+name);
        System.out.println("age "+x);
        // if i use nonstatic method in stati method i will get error and also applicible for non static variable 
        System.out.println("i am static ");
    }
    
}
