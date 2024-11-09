
package W78_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class W159 {
  
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> a= new ArrayList<Integer>();
        System.out.print("enter array number: ");
        int n=in.nextInt();
        for (int i = 0; i <n; i++) {
            int x=in.nextInt();
            a.add(x);
        }
       // System.out.println(a);
        
        Collections.sort(a,Collections.reverseOrder());
       // System.out.println(a);
       // int lenth=a.size();
        System.out.println("3 largest elements of the said array are: ");
        for (int i =0; i<3; i++) {
            System.out.print(a.get(i)+" ");
        }
       
    }
    
}
