
package Static;


public class StaticVariable {
     String name;
   static String un="PSTU";
    int a;
    StaticVariable(String s1,int x){
        name=s1;
        a=x;
    
}
    void show(){
       System.out.println("name "+name);
        System.out.println("age  "+a);
        System.out.println("university   "+un);
        //System.out.println("age  "+a);
    }
    
    
}
