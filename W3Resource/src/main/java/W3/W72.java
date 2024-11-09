
package W3;

import java.util.Scanner;

public class W72 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\n input string: ");
        String s1=in.next();
        int lenth=s1.length();
        if(lenth<=3){
            
            System.out.print("###");
            
        }
        else
            System.out.println(s1.substring(0,3));
    }
    
}
