
class Pen {
String color;
String type;
public void write(){
    System.out.println("write something ");

}
public void printcolor(){
    System.out.println(this.color);// here this use for which object is called color for print
}
public void printtype(){
    System.out.println(this.type);// here this use for which object is called color for print
}
    
}

 class Student {
String name;
int  age;
public void info(){
    System.out.println("name of student "+this.name);
    System.out.println("Student age  "+this.age);
}
    
}

public class L1{
    public static void main(String[] args) {
        Pen pen1=new Pen(),pen2=new Pen();
        pen1.color="green";
        pen1.type="gel";
       // pen1.write();
       pen2.color="red";
       pen2.type="ballpoint";
       pen1.printcolor();
       pen1.printtype();
       pen2.printcolor();
      
       pen2.printtype();
       Student s1=new Student();
       s1.name="Abdur Rahim ";
       s1.age=21;
       s1.info();


        
    }
}