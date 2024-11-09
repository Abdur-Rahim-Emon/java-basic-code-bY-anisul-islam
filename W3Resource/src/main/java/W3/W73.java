
package W3;

import java.util.Scanner;


public class W73 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1=in.next();
        String s2=in.next();
        String s="#";
        String s3=new String();
        int L1=s1.length();
        int L2=s2.length();
        System.out.println("len"+L2);
        if(L1==1)
        {
            s3= s + s2.substring(0,L2);
            System.out.println(s3);
        }
        else if(L2==1)
        {
            s3=s1.substring(0,1)+s;
            System.out.println(s3);
        }
        else
        {
            s3=s1.substring(0,1)+s2.substring(L2-1,L2);
            System.out.println(s3);
        }
        
        
    }
    
}
