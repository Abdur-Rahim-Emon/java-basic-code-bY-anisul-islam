
package W78_;

import java.util.Arrays;

public class W96 {
    public static void main(String[] args) {
        int[] a={10,30,45,20,20,10,20};
        String s1=Arrays.toString(a);
        System.out.println("input array : "+s1);
       if(s1.contains("10") && s1.contains("20"))
            System.out.println("true");
       else
            System.out.println("false");
       
    }
}
