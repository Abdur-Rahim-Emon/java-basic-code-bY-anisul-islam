
package WR;

import java.util.ArrayList;


public class W175 {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        int[] b={10,20,30,40};
        for (int i = 0; i < b.length; i++) {
            a.add(b[i]);
        }
        System.out.println("orginal array : "+ a);
        System.out.println("enter the remove digit  : 40");
        int index= a.indexOf(40);
       
        a.remove(index);
        System.out.println("result array : "+ a);
        
        
    }
}
