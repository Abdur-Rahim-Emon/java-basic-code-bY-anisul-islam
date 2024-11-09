
package String;

import java.util.Scanner;

public class L86 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      /* String s="are are";
       String s2=new String ("Are Are");
       char[] ch=new char[5];
        for (int i = 0; i < 5; i++) {
            ch[i]=in.next().charAt(0);
        }
        for (int i = 0; i < 5; i++) {
            //ch[i]=in.next().charAt(0);
             System.out.println(" "+ch[i]);
        }
        System.out.println(ch);
        boolean x= s.equals(s2);
        System.out.println(" s and s2 are equal : "+x);
        boolean y=s.contains(s2);
        System.out.println("s and are equals "+y);
        boolean z=s.equalsIgnoreCase(s2);
        System.out.println("are equal "+z);
        boolean t=s.contains("ate");
        boolean w=s.isBlank();
        System.out.println("contains "+t);
        System.out.println("contains "+w);*/
      
      String x = "are";
      String y=new String("aRe");
        System.out.println(" "+x);
        System.out.println(" "+y);
       boolean b=x.contains(y);
        System.out.println("x contains y "+b);
        b=x.contains("are");
        System.out.println("x contains are "+b);
        b=x.equals(y);
        System.out.println("x and y are equals "+b);
        b=x.equalsIgnoreCase(y);
        System.out.println("x and y are but different in upper and lower "+b);
        b=x.isEmpty();
        System.out.println("x is empty "+b);
      
      
    }
}
