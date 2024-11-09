
package WR;

import java.util.ArrayList;
import java.util.Collections;


public class W180 {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        int[]b={10,20,30,40,50};
        for (int i = 0; i <b.length; i++) {
            a.add(b[i]);
        }
        System.out.println("orginal arrray : "+a);
        for (int i = 0; i <a.size()-2; i++) {
             Collections.swap(a, i, i+1);
        }
       
        System.out.println("result array : "+a);
        
        
    }
}
