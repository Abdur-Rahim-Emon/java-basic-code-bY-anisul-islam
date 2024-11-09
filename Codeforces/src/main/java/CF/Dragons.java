
package CF;

import java.util.Arrays;
import java.util.Scanner;

public class Dragons {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int s=in.nextInt();
       int n=in.nextInt();
       int x,y,count=0;
        int[][] a=new int[n][2];
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <2; j++) {
                a[i][j]=in.nextInt();
            }
        }
        
       
        int temp=0,temp1;
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n-1; j++) {
                if(a[j][0]>a[j+1][0])
                {
                    temp=a[j+1][0];
                    a[j+1][0]=a[j][0];
                    a[j][0]=temp;
                    temp=a[j+1][1];
                    a[j+1][1]=a[j][1];
                    a[j][1]=temp;
                    
                }
            }
            
        }
       for (int i = 0; i <n; i++) {
            for (int j = 0; j <1; j++) {
                if(a[i][j]<s)
                {
                    count++;
                    s+=a[i][j+1];
                }
            }
        }
       
        
        if(count==n)
            System.out.println("YES");
        else
            System.out.println("NO");
        /*for (int i = 0; i <n; i++) {
            for (int j = 0; j <2; j++) {
                System.out.print(""+a[i][j]);
            }
            System.out.println("");
        }
        */
    }
    
}
