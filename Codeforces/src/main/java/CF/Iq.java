
package CF;

import java.util.Scanner;

public class Iq {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        for(int i=0; i<n; i++)
        {
            a[i]=in.nextInt();
            b[i]=in.nextInt();
            
        }
        int count=0;
        for(int i=0; i<n; i++)
        {
            for(int j=i+1; j<n; j++){
                if(a[i]==b[j])
                    count++;
            }
            
        }
        int count1=0;
        for(int i=0; i<n; i++)
        {
            for(int j=i+1; j<n; j++){
                if(b[i]==a[j])
                    count1++;
            }
            
        }
        System.out.println(""+(count+count1));
    }
    
}
