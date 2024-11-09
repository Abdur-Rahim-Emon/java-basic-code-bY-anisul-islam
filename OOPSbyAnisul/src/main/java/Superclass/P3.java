
package Superclass;

class A3{
    A3(){
        System.out.println("a s constractor ");
    }
}
 class B3 extends A3{
    B3(){
        System.out.println("b s constractor ");
    }
}
public class P3 {
    public static void main(String[] args) {
        B3 r=new B3();
        
    }
    
}
