
package StaticBlock;


public class SB {
    static int x;
    static String s1;
    static{
        x=20;
        s1="Abdur ";
    }
   static void display(){
        System.out.println("age "+ x + "\nname : "+s1);
    }
    public static void main(String[] args) {
        SB.display();
    }
    
}
