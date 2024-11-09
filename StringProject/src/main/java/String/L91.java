
package String;

import java.util.Scanner;


public class L91 {
    public static void main(String[] args) {
        String s=new String();
        Scanner in=new Scanner(System.in);
        s=in.next();
        StringBuffer s1=new StringBuffer(s);
        String s2=s1.reverse().toString();
        StringBuffer s3=new StringBuffer(s1);
        System.out.println(""+s3);
        if(s.contains(s2))
            System.out.println("yes");
        else
            System.out.println("no");
        if(s1.equals(s3))// answer will be no every time beacuse in s3 store the reverse string
            System.out.println("yes");
        else
            System.out.println("yse it wout ");
                
    }
}
