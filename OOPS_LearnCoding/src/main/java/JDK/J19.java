
package JDK;
interface A1{
    default void get (int x,int y){
        add(x,y);
    }
    private  void  add(int x,int y){
        System.out.println("sum is "+(x+y)); 
    }
    
}
class B1 implements A1 {
    void sub(int x,int y){
        System.out.println("sub is : "+ (x-y));
    }
    
    
}
public class J19 {
    public static void main(String[] args) {
        B1 d1=new B1();
       d1.get(22,2);
        d1.sub(33,3);
    }
    
}
