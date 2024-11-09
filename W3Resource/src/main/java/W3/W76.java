
package W3;

import java.util.ArrayList;
import java.util.Scanner;


public class W76 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<Integer> b=new ArrayList<>();
        System.out.print("number of array ");
        int n=in.nextInt();
        for (int i = 0; i <n; i++) {
            int x=in.nextInt();
            a.add(x);
            
        }
         for (int i = 0; i <n; i++) {
            int y=in.nextInt();
            b.add(y);
            
        }
       int len1= a.size();
       int len2= b.size();
       int first=a.getFirst();
       int last=b.getLast();
        //System.out.println(""+first+""+last);
        if(len1>=2 && first==last && len2>=2 ){
            System.out.println("true");
            
        }
        else
            System.out.println("false");
        
    }
    
}
