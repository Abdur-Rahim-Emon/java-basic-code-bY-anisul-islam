
package Superclass;
 class A{
     int x=44;
     
 }
class B extends A{
    int x=3;
    void display(){
        System.out.println(x);//printing the local subclass x value
        System.out.println(super.x);
    }
}

public class P1 {
    public static void main(String[] args) {
        B r=new B();
        r.display();
    }
    
}
