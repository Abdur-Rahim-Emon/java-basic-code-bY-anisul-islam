
package OOPs;
class A{
    int age;String name;
    void set(String s1,int z){
        name=s1;
        age=z;
    }
    void show(){//in method without perameter 
        System.out.println("name  "+name+"age   "+age);
    }
}
public class L100t0103 {
    public static void main(String[] args) {
        A a=new A();
        a.age=33;
        a.name="ARE";
        a.show();
        A b=new A();
        b.set("dfjkjf",3442314);
        b.show();
        
    }
    
}
