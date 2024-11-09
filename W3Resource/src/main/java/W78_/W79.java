
package W78_;

import java.util.Arrays;
import java.util.Scanner;

public class W79 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a=new int[3];
        for (int i = 0; i <3; i++) {
            a[i]=in.nextInt();
        }
        int temp=0;
        for (int i = 0; i <2; i++) {
            temp=a[i];
            a[i]=a[i+1];
            a[i+1]=temp;
            
            
        }
        System.out.println("rotae the arary : "+Arrays.toString(a));
        
    }
}
