
package execution;

import java.util.Scanner;

public class L34 {
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        
        int n1,n2;
        n1=in.nextInt();
        n2=in.nextInt();
        int r=n1>n2 ? n1:n2;
        System.out.printf("%d ",r);
        
    }
    
}
