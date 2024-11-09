
package This_Keyword;
class Person{
    String name;
    String bc;
    int age;
    Person(String name,int age){
        this.name=name;
        this.age=age;
        
    }
    Person(String name,int age,String bc){
      this(name,age);
      this.bc=bc;
      
        
    }
    void display(){
        System.out.println("name : "+name);
        System.out.println("age : "+age);
        System.out.println("bodycolour : "+bc);
    }
    
}

public class P1 {
    public static void main(String[] args) {
        Person d1=new Person("Abdur",22);
        d1.display();
        Person d2=new Person("Emon ",22,"white");
        d2.display();
        
    }
    
    
}
