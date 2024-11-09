
package Inheritance;

public class Student extends Person {
    String zila;
   void set(String name , int age ,String zila){
        this.name=name;
        this.age=age;
        this.zila=zila;
        
    }
    void show(){
        System.out.println("name : "+name);
        System.out.println("age : "+age);
        System.out.println("zila : "+zila);
    }
    
}
