
package W78_;

import java.util.Arrays;
import java.util.Scanner;


public class W62 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a={1,4,17,7,25,3,100};
        int sum=0;
        for (int i = 0; i <a.length; i++) {
            sum+=a[i];
        }
        System.out.println("orginal array : ");
        System.out.println(Arrays.toString(a));
        double avg=sum/a.length;
        System.out.println("the average of said array is : "+avg);
        for (int i = 0; i <a.length; i++) {
            if(avg<a[i])
                System.out.println(a[i]);
        }
    }
}
