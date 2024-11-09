
package String;
import java.util.ArrayList;
import java.util.Arrays;


import java.util.Scanner;

public class C {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
          String x=" are";
          String y=new String(" Are ");
          System.out.println(x);
          Boolean b=x.isEmpty();
          System.out.println("is x empty "+b);
          int index=x.indexOf('a');
          System.out.println(index);
          b=x.contains(y);
          System.out.println("is x and y are same "+b);
          b=x.equalsIgnoreCase(y);
          System.out.println("is ignore case"+b);
          b=x.equals(y);
          System.out.println("is equal "+b);
          b=x.startsWith("a");
          System.out.println("is start with a "+b);
          b=x.endsWith("e");
          System.out.println("end with e "+b);
          String s=x+y;
          System.out.println(" "+s);
          int pos=x.codePointAt(0);
          System.out.println("ascii of a "+pos);
         // System.out.println(" trim"+s);
         String s1=s.trim();
         System.out.println(s1);
       String s2=  s.replace('a','i');
         System.out.println(s2);
         String s3="ARe im are";
          String[] s4=s3.split(" ");
          for(String z:s4)
          {
              System.out.println("split are "+z);
          }
          
          
          System.out.println(" "+s3.toLowerCase());
          
          s3.toUpperCase();
          System.out.println(s3);
       
    }
            
}
