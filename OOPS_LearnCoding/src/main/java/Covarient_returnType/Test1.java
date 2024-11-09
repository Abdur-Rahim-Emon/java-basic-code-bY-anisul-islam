
package Covarient_returnType;
class A1{
    A1 show(){
        System.out.println("this is method A ");
        return this;// new A();
    }
}
class B1 extends A1 {
    B1 show(){
        super.show();
        System.out.println("this is method B ");
        return this;// new A();
    }
}
public class Test1 {
    public static void main(String[] args) {
        B1 b=new B1();
        b.show();
    }
    
    
}
