
package WR;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class W178 {
    





    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<Integer> b=new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int x;
        int[]z={7, 2, 4, 1, 3, 5, 6, 8, 2, 10};
        for (int i = 0; i < z.length; i++) {
            // x=in.nextInt();
             a.add(z[i]);
        }
        int count=1;
        System.out.println("orginal array : "+ a);
        for (int i = 0; i <a.size()-1; i++) {
            if(a.get(i)<a.get(i+1)){
               count++;
               
            }
            else{
                b.add(count);
                count=1;
            }
        }
        Collections.sort(b,Collections.reverseOrder());
        int max=b.get(0);
        
        System.out.println("max list : "+max);
    }
    
}

    

