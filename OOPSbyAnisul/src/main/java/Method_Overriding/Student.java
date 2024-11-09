
package Method_Overriding;
 class Person{
    String name ;
    int age;
    void show(){
        System.out.println("Name "+ name);
        System.out.println("Age  "+age);
    }
}
public class Student extends Person{
    String un;
    @Override
    void show(){
                System.out.println("Name "+ name);
        System.out.println("Age  "+age);
        System.out.println("university "+un);
    }
    public static void main(String[] args) {
        Student s1=new Student();
        Person s2=new Person();
        s1.name="ARE";
        s1.age=21;
        s2.name="IM";
        s2.age=21;
        s1.un="pstu";
        s1.show();
        s2.show();
        
        
    }
}


