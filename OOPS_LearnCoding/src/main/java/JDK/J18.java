
package JDK;
interface  A{
    int x=10;
    void show();
    void dis();
    default void dis1(){
        System.out.println("this is default meahod in interface ");
    }
    
    
}
class B implements A{
    
  @Override
  public void dis1(){
      dis1();
      
      System.out.println("is called by B ");
  }
   public void show(){
        System.out.println("this is show method ");
    }
   public  void dis(){
        System.out.println("this is dis method ");
    }
}
public class J18 {
    public static void main(String[] args) {
        A d1;
        d1=new B();
        d1.show();
        d1.dis();
        d1.dis1();
       
       // d1.dis1();
        
    }
    
}
