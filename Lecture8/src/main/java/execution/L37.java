
package execution;

import java.util.Scanner;



public class L37 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      int k=1;
      int [][] x=new int[2][2];
      int [][] y=new int[2][2];
      int [][] z=new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("A[%d][%d]= ",i,j);
                x[i][j]=in.nextInt();
               // System.out.println("");
                
            }
            
        }
         System.out.print("A= ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("\t "+x[i][j]);
               // x[i][j]=in.nextInt();
               
                
            }
             System.out.println("");
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("B[%d][%d]= ",i,j);
                y[i][j]=in.nextInt();
               // System.out.println("");
                
            }
            
        }
         System.out.print("B= ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("\t "+y[i][j]);
               // x[i][j]=in.nextInt();
               
                
            }
             System.out.println("");
        }
        int sum=0;
        System.out.println("C= ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("\t "+ (y[i][j]+x[i][j]));
               // x[i][j]=in.nextInt();
               
                
            }
             System.out.println("");
        }
         
       
     
       
    }
    
}
 