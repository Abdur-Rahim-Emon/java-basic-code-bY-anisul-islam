
package WR;

import java.util.ArrayList;
import java.util.Arrays;

public class W179 {
    public static void array(int[]a){
                ArrayList<Integer> r=new ArrayList<>();
                int count=0;
                for (int i = 0; i < a.length; i++) {
                    {
                        if(a[i]==9){
                            count++;
                        }
                    }
                    if(count==a.length){
                        for (int j = 0; j <=a.length; j++) {
                            if(j==0)
                            r.add(1);
                            else
                                r.add(0);
                        }
                }
        }
                System.out.println("orginal array : "+Arrays.toString(a));
                System.out.println("result Array : "+r);

    }
    public static void main(String[] args) {
        int[]b={9, 9, 9, 9};
        
        array(b);
        
    }
}
