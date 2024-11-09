
package InheritancePrivate;


public class Student extends Person{
    String hallcode;
    void show(){
        System.out.println("Name "+getName());
        System.out.println("age  "+getAge());
        System.out.println("hall name  "+getHall());
        System.out.println("hall code "+hallcode);
    }
    
    
}
