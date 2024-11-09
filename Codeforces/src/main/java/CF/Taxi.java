
package CF;

import java.util.Arrays;
import java.util.Scanner;

public class Taxi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];
        int one=0,two=0,three=0,four=0;
        for(int i=0; i<n; i++)
        {
            a[i]=in.nextInt();
            if(a[i]==4)
                four++;
            else if(a[i]==3)
                three++;
           else if(a[i]==2)
                two++;
            else 
                one++;
        } 
        
      int d;
      d=three-one;
      int taxi=0,x=0;
      if(d>=0)
      {
          taxi=three ;
      }
     else
      { x=Math.abs(d);
      taxi=three;
      }
         
       taxi=taxi+(two)/2 + x/4+four;
       int rem1=x%4;
       int rem2 =two%2;
       ///int d1=rem1;
       if(rem2>0)
       {
           if(rem1<=2)
               taxi=taxi+1;
           else
               taxi=taxi+2;
       }
       else if(rem1>0)
           taxi=taxi+1;
           
       
       
       
        System.out.println(taxi);
      
       
  }
    
}