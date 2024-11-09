
package CF;

import java.util.Arrays;
import java.util.Scanner;

public class Puzzles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int[] a=new int[m];
        for(int i=0; i<m; i++)
        {
            a[i]=in.nextInt();
        }
        int count=0;
          int max;
        int min;
        int dif;
        Arrays.sort(a);
         max=a[n-1];
            min=a[0];
             dif=max-min;
             //System.out.println("sid"+dif);
              int x=0;  
        for (int i =1; i <=(m-n); i++) {
            max=a[n-1+i];
            min=a[0+i]; 
           count=max-min;
           // System.out.println("dif"+count);
                        if(dif>=count)
                dif=count;
            
           
        } 
             
                 
             
        System.out.println(""+dif);
       
       
        
            }
    
}
