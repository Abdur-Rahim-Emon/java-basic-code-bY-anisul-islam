package Constructor;
// we use here Class ,object ,inheritance ,polymorphism ,super ,this
 class A {// parent class
    int age;
    String name;
    public A(int age, String name) {
        this.age = age;
        this.name = name;
    }


    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

    }
}

class B extends A {
    String varsity;
    B(int age, String name ,String varsity) {
      super(age, name);
      this.varsity = varsity;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Varsity: " + varsity);

    }
}
public class C {
    public static void main(String[] args) {
        B d1=new B(22,"Emon","pstu");//creating an object of class B
        d1.display();
        System.out.println("printing the second object data");
        B d2=new B(22,"NJ","cstu");
        d2.display();
    }

}