
package WR;

import java.util.Scanner;


public class W169 {
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder();
        Scanner in = new Scanner(System.in);
        String s1 =in.nextLine();
        System.out.println("orginal String are : "+s1);
        String[] s2=s1.split(" ");
        
        for (int i =s2.length-1; i >=0; i--) {
            s.append(s2[i]);
            s.append(" ");
        }
        System.out.println("reverse String are : "+s);
    }
    
}
