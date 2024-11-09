
package CF;

import java.util.Scanner;


public class CandiesandTwoSisters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int c,count;
        for (int i =1; i<=n; i++) {
            c=in.nextInt();
           if(c%2!=0)
           {
               count=(c+1)/2;
               System.out.println(""+(count-1));
                
            }
           else
           {
               count=c/2;
               System.out.println(""+(count-1));
           }
        }
    }
    
}
