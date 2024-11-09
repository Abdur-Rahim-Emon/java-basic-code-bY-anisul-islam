
package W78_;

import java.util.Scanner;

public class W156 {
    static void log(int n){
        double log10=Math.log10(n);
        
        double log2=log10/Math.log10(2);
        System.out.println("log2 value is : "+log2);
        
        
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int org=n;
        int shift_right_number=0;
        do{
            n>>=1;
     shift_right_number++;
        } while (n!=0);
        System.out.println(shift_right_number);
       // System.out.println("irginal number: "+n);
        shift_right_number--;
        System.out.println("logarithm number: "+shift_right_number);
        // 1 2 4  8 16 32 10100
        log(org);
    }
}
