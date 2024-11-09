
package StaticPart3;

public class Count {
   static int num=0;
   String name;
   int age;
   
    Count(String n, int x){
        num++;
        name =n;
        age=x;
        
    }
    void show(){
        System.out.println("Name "+name);
        System.out.println("Age "+age);
    }
}
