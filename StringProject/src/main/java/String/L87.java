
package String;

import java.util.Scanner;

public class L87 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fn="Abdur";
        String ln=" iffat";
        String fun=fn+ln;
        System.out.println(" full name "+fun);
        System.out.println(" full name"+fn.concat(ln));
        System.out.println("upper in all "+fun.toLowerCase());
        System.out.println("upper in all "+fun.toUpperCase());
        boolean b=fn.startsWith("Ab");
        System.out.println(" start with Ab "+b);
        
        b= ln.endsWith("at");
        System.out.println(" start with at "+b);
        
    }
    
}
