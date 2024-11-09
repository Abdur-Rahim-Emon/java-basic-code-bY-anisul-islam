
package WR;

import java.util.ArrayList;
import java.util.Arrays;


public class W176 {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<Integer> b=new ArrayList<>();
        int[]r={ 7, 2, 4, 1, 3, 5, 6, 8, 2, 10};
        for (int i = 0; i <r.length; i++) {
            if(r[i]%2==0)
            a.add(r[i]);
            else
                b.add(r[i]);
        }
        System.out.println("orginal array : "+Arrays.toString(r));
        
       a.addAll(b);
        System.out.println("result  array are : "+a);
    }
  
    
}
