
package W78_;

import java.util.Scanner;

public class W52 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b,c,d;
        System.out.print("input first number: ");
        a=in.nextInt();
        System.out.print("input secend number: ");
        b=in.nextInt();
        System.out.print("input third number: ");
        c=in.nextInt();
        System.out.print("input fourth number: ");
        d=in.nextInt();
        if((a==b && b==c && c==d)){
            System.out.println("nunbers are equal ");
        }
        else
            System.out.println("numbers are not equal ");
        
    }
    
}
