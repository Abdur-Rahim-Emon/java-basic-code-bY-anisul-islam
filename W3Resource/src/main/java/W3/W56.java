
package W3;

import java.util.Scanner;


public class W56 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x=in.nextInt();
        int y=in.nextInt();
        int p=in.nextInt();
         int count =0; 
        for(int i=x; i<=20; i++)
        {
           if(i%3==0)
            count++;
        }
        System.out.println("the number is "+count);
    }
    
}
