
package Covarient_returnType;

class A{
    int dis(int x,int y){
        System.out.println("sum of two number : "+(x+y));
        return 0;
        
    }
}
class B extends A {
    
  

  
    @Override
    int dis(int x,int y){
        super.dis(x, y);
        System.out.println("mul of two numbers : "+(x*y));
        return 0;
        
    }
    
}
public class Test {
    public static void main(String[] args) {
        B d1=new B();
        d1.dis(33, 55);
    }
}
