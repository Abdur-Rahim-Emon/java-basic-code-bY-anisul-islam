
package W3;

import java.util.Scanner;

public class W63 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the first number  : ");
        int a =in.nextInt();
        System.out.println("Input the secend  number  : ");
        int b=in.nextInt();
        System.out.println("result : "+result(a,b));
        
    }
    public static int result(int p, int q){
        if(p==q)
            return 0;
        else if(p%6==q%6)
            return (p>q?q:p);
        if(p>q){
            return p;
        }
        else
            return q;
    }
}
