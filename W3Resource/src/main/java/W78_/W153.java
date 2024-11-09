
package W78_;

import java.util.Scanner;

public class W153 {
    public static void main(String[] args) {
        double a,b;
        System.out.print("input first number: ");
        Scanner in = new Scanner(System.in);
        a=in.nextDouble();
        System.out.print("input first number: ");
        b=in.nextDouble();
        if(a>=0 && a<=1 && b>=0 && b<=1)
            System.out.println("true ");
        else
            System.out.println("false ");
    }
    
}
