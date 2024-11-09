
package Polymarphism;
class A{
    double area(){
        return 1;
    }
}
class B extends A{
    double h,w;
    B(double h,double w){
        this.h=h;
        this.w=w;
    }
    @Override
    double area(){
        return h*w;
    }
    
}
class C extends A{
    double b,l;
    C(double b,double l){
        this.b=b;
        this.l=l;
    }
    @Override
    double area(){
        return .5*b*l;
    }
}
public class P3 {
    public static void main(String[] args) {
       // A d1=new A();
       /* System.out.println("area of a : "+ d1.area());
       d1=new B(35.34,3434.55);
        System.out.println("area of a : "+ d1.area());
        d1=new C(3423,434);
        System.out.println("aarea of c "+d1.area());*/
        //we can acess area by using array
        A[] d1=new A[3];
        d1[0]=new B(134.34,3434.4);
        d1[1]=new C(13,3);
        d1[2]=new A();
        for (int i = 0; i <3; i++) {
            System.out.println("area of : "+d1[i].area());
            
        }
        
    }
    
}
