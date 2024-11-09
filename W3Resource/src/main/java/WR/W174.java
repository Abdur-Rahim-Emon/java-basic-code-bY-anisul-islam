
package WR;

import java.util.Arrays;

public class W174 {
   
 
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,8};//1 2 3 4 5 6 7 8 9 10 2.5 3.5 4.5 6.5 7.5 8.5
        int lenth=a.length;
        int k=3;
        Arrays.sort(a);
        
        if(k%2!=0){
        for (int i = 1; i <=a.length-2; i++) {
            System.out.print(a[i]+" ");
        }
        }
        
    }
}
