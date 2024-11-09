
package execution;

import java.util.Arrays;
import java.util.Scanner;

public class StringLecture73 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String[] s=new String[5];
        for (int i = 0; i < 5; i++) {
            s[i]=in.next();
        }
        String[] s1={"sf","ff"};
        int len=s.length;
        System.out.println("len is "+len);
       Arrays.sort(s);
       
        for (int i = 0; i < 5; i++) {
            System.out.println(s[i]);
        }
    }
    
}
