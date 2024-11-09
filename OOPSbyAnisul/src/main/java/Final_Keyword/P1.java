
package Final_Keyword;
class A{
    final String un="pstu";
    final int  sf;//blank final variable it can initail constarcator
    static final  String hall;//static finnal variable it can intial using static block
    A(){
        sf=4000;
    }
    static{
        hall = "M.keramot";
    }
    void show(){
        System.out.println("name university : "+un+"\n semester fee : "+sf+"\n hall name : "+hall);
    }
    
}

public class P1 {
    public static void main(String[] args) {
        A d=new A();
        d.show();
    }
    
    
}
