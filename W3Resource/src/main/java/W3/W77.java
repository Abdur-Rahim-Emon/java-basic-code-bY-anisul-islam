
package W3;

import java.util.ArrayList;
import java.util.Scanner;

public class W77 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         ArrayList<Integer> b=new ArrayList<>();
         ArrayList<Integer> a=new ArrayList<>();
         ArrayList<Integer> c=new ArrayList<>();
       
        
        for (int i = 0; i <3; i++) {
            int x=in.nextInt();
            a.add(x);
            
        }
         for (int i = 0; i <3; i++) {
            int y=in.nextInt();
            b.add(y);
            
        }
         System.out.println("Array1:  "+a);
         System.out.println("Array2:  "+b);
         c.add(a.get(0));
         c.add(b.get(2));
         System.out.println("New Array: "+c);
         
    }
    
}
