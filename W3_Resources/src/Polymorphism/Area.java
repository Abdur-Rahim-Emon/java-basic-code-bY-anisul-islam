package Polymorphism;

class shape{
    //double area;
    double a,b;
    void area(double a, double b){


    }
    double getArea(){
        return 0;
    }

}
class circle extends shape{
    void area(double a,double b){

        System.out.println("circle area "+a*b*Math.PI);
    }
   /* void circleArea(){
        System.out.println("circle area "+getArea()*Math.PI);
    }*/
}
class rectangle extends shape{
    void area(double a,double b){

        System.out.println("rectangle area "+(a*b)/2);
    }
    /*void rectangleArea(){
        System.out.println("rectangle area "+getArea());
    }*/
}
public class Area {
    public static void main(String[] args) {
        shape display = new shape();
        display.area(10.3,20.3);
        System.out.println(display.getArea());
        display = new rectangle();
        display.area(1.3,2.4);

        display=new circle();
        display.area(1.5,2.4);
        System.out.println("output of array ");
        shape[] dis=new shape[3];
        dis[0]=new circle();
        dis[1]=new rectangle();
        dis[2]=new shape();
        dis[0].area(10.3,20.3);
        dis[1].area(10.3,20.3);
        dis[2].area(10.3,20.3);
        System.out.println("area of shape " + dis[2].getArea());



    }

}

