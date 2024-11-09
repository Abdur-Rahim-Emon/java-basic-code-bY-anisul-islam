
package Abstract;
abstract class MB{
    static void display(){
        System.out.println("using class MB");
    }
    
    abstract void call();
}
class Kasem extends MB{
    @Override
    void call(){
       
        System.out.println("i am kasem ");
    }
}
class Babul extends MB{
    void show(){
        System.out.println("15 july is the most hostorical day of my life ");
    }
    @Override
    void call(){
         display();
        System.out.println("i am babul ");
    }
}
public class P2 {
    public static void main(String[] args) {
        MB d;// is reference variable it can access through the abstract method
       d=new Kasem();
       d.call();
       d=new Babul();
       d.call();
       Babul d2=new Babul();
       d2.show();
       MB.display();
        
        
    }
    
    
}
