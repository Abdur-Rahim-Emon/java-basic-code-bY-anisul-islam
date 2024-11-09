
package W3;

import java.util.Scanner;

public class W70 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1=in.next();
        String s2=in.next();
        if(s1.length()>s2.length())
            System.out.println(s1+s2+s1);
        else
            System.out.println(s2+s1+s2);
        
    }
    
}
