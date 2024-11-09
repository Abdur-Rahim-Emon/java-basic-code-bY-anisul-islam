
package Abstract;




abstract class Shape{
    double d1,d2;
    Shape(double d1,double d2){
        this.d1=d1;
        this.d2=d2;
    }
    
    abstract double area();
}
class R extends Shape{
    R(double x,double y){
        super(x,y);
    }
    
    @Override
    double area (){
        return d1*d2;
       
    }
}
class Circle extends Shape{
   //double d1;double d2;
    Circle(double a){
      super(a,a);
    }
    double area(){
        return d1*d2;
    }
}

public class P3{
    public static void main(String[] args) {
      Shape shape;
      shape=new R(34.3,43);
        System.out.println("area of reactangle : "+shape.area());
        
        shape=new Circle(4.0);
        System.out.println("area of circle is : "+shape.area());
        
        
    }
    
    
}
