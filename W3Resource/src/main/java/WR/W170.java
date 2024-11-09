
package WR;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class W170 {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<Integer> b=new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int x;
        
        for (int i = 0; i < 17; i++) {
             x=in.nextInt();
             a.add(x);
        }
        int count=1;
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
