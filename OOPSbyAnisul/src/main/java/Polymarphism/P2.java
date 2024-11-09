
package Polymarphism;
class Person{
    void show(){
        System.out.println("i am a person ");
    }
}
class Student extends Person{
   @Override
   void show(){
       System.out.println("print the child class ");
       super.show();
       System.out.println("i am a student ");
   }
}

public class P2 {
    public static void main(String[] args) {
        Person p1= new Person();
        p1.show();
        p1=new Student();
        p1.show();
    }
    
    
}
