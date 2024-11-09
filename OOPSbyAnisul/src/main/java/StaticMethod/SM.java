
package StaticMethod;

public class SM {
    static int x; static String s1;
    SM(int x,String s1){
        this.x=x;
        this.s1=s1;
    }
    void show(){
        System.out.println("this not a static method ");
        System.out.println(x+ " name "+s1);
        
    }
    static void Show(){
        System.out.println("i am  a static method  for access me you should use class name . i am not access by object . and main is also static so that it can call first .and execute begin from here");
        System.out.println(x+ " name "+s1);
    }
    
    
}
