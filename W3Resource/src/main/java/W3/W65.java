
package W3;

import java.util.Scanner;


public class W65 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input first number : ");
        int a=in.nextInt();
        System.out.print("Input Secend number : ");
        int b=in.nextInt();
        int mod=(a/b);
        int r= a-(mod*b);
        System.out.println(""+r);
    }
    
}
