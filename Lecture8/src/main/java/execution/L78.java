
package execution;

import java.util.Scanner;

public class L78 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int[][] a=new int[n][m];
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("A[%d][%d]= ",i,j);
                a[i][j]=in.nextInt();
                
            }
            
        }
        System.out.println("A= ");
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("\t "+a[i][j]);
               // a[i][j]=in.nextInt();
                
            }
            System.out.println("");
        }
        int r=0,l=0;
         for (int i = 0; i <n; i++) {
            for (int j = 0; j < m; j++) {
                
                if(i==j || i<j)
                    r=r+a[i][j];
                else
                    l=l+a[i][j];
            }
            
        }
         System.out.println("result of diagonal matrix sum= "+r);
         System.out.println("result of under  matrix sum= "+l);
    }
    
}
