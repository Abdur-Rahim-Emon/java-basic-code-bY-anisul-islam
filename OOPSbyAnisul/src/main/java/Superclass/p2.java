
package Superclass;

class A2{
    void show(){
        System.out.println("this super class ");
    }
}
class B2 extends A2{
    
    void show(){
        super.show();
        System.out.println("this is sub class ");
    }
    
}
public class p2 {
    public static void main(String[] args) {
        B2 r= new B2();
        r.show();
    }
    
}
