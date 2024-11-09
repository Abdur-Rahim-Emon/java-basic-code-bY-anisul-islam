
package W78_;

import java.util.Arrays;
import java.util.Scanner;

public class W161 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[]a=new int[7];
        for (int i = 0; i < 7; i++) {
         a[i]=in.nextInt();   
        }
        System.out.println("enter the kth element in the array : ");
        int x=in.nextInt();
        Arrays.sort(a);
        int lenth=a.length;
        System.out.println(lenth);
        int max=a[lenth-x];
        int min=a[0+x];
        System.out.println("K'th largest element of the said array: "+max);
        System.out.println("K'th smallest element of the said array: "+min);
    }
    
}
