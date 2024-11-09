
package W3;

import java.util.ArrayList;
import java.util.Scanner;

public class W74 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> a=new ArrayList<>();
        System.out.print("number of array ");
        int n=in.nextInt();
        for (int i = 0; i <n; i++) {
            int x=in.nextInt();
            a.add(x);
            
        }
       int len= a.size();
       int first=a.getFirst();
       int last=a.getLast();
        //System.out.println(""+first+""+last);
        if(len>=2 && first==last ){
            System.out.println("true");
            
        }
        else
            System.out.println("false");
        
    }
    
}
