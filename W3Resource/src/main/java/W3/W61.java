
package W3;

import java.util.Scanner;


public class W61 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a word : ");
        String s1=in.nextLine();
     StringBuilder s2= new StringBuilder(s1);
     s2.reverse();
        System.out.println(""+s2);
        
    }
    
}
