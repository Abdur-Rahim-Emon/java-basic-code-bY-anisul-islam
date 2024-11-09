
package W3;

import java.util.Scanner;


public class W69 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("\n TEst data : ");
        String s1=in.next();
        int len=s1.length();
        System.out.println("len "+len);
        System.out.println("\nOuptput : "+s1.substring(0,(len/2)));
    }
    
}
