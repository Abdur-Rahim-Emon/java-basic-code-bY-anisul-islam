
package BoxPblm1;

public class Box {
    double h,w,l;
    Box(double a,double b,double c){
        h=a;
        w=b;
        l=c;
        
        
    }
    void display(){
        System.out.println("volume  : "+ h*w*l);
    }
    public static void main(String[] args) {
        Box r1=new Box(10,10,10);
        Box r2=new Box(20,30,10);
        r1.display();
        r2.display();
    }
}
