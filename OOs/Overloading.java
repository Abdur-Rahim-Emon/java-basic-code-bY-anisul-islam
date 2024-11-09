// Constractor Overloading 
class A{
    int a; double d; 
    String s1;
    A(){
        a=131; d=234.424; s1="Abdur Rahim Emon";
    }
    A(int x){
        a=x;
    }
    A(double de,String s2)
    {
        d=de;
        s1=s2;
        
    }

}
public class Overloading{
    public static void main(String[] args) {
       
        A r2=new A(212);
        A r3=new A(2112.21, "ghghg");
        A r1=new A();
        System.out.println(r1.a+"  "+ r1.d+"   "+r1.s1);
        System.out.println(r2.a);
        System.out.println(r3.d + " "+ r3.s1);
    }
}
// using privet constractor
