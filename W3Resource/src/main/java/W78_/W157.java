
package W78_;

import java.util.Scanner;

public class W157 {
    public static void main(String[] args) {
        System.out.println("enter two numbers : ");
        Scanner in = new Scanner(System.in);
        int x,y;
        x=in.nextInt();
        y=in.nextInt();
        if(x<y){
            int temp;
            temp=y;
            y=x;
            x=temp;
        }
        while(y!=0){
            int rem;//60 48 12 48 12 0 
            rem=x%y;
            x=y;
            y=rem;
        }
        System.out.println(x);
    }
    
}
