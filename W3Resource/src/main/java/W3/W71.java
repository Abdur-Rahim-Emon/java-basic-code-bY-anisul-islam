
package W3;

import java.util.Scanner;

public class W71 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String c1=in.next();
        String c2=in.next();
        StringBuilder  s1=new StringBuilder(c1);
        StringBuilder s2=new StringBuilder(c2);
        s1.deleteCharAt(0);
        s2.deleteCharAt(0);
        s1.append(s2);
        System.out.println(s1);
        
    }
    
}
