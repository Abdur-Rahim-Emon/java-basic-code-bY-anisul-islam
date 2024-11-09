
package execution;


import java.util.Scanner;

            public class LarraySort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      int  n;
      n=in.nextInt();
      
      int[] a= new int[n];
        for (int i = 0; i <n; i++) {
          a[i]=in.nextInt();
        }
        int[] b=new int[n];
        
        for(int i=0; i<n; i++)
        {
            b[i]=0;
        }
        for(int i=0; i<n; i++)
        {
            b[a[i]]++;
        }
        for (int i = 0; i < n; i++) {
            if(b[i]!=0)
            {
                System.out.printf(" numbers are %d %d\n",i,(b[i]));
            }
            
        }
      
      
      
      
         
        
        
        
    }  
}
