
package W78_;

import java.util.Scanner;

public class W87 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("\ninput number: ");
        int n=in.nextInt();
       int  temp=n;
       int sum=0;
       int rem;
        while(temp!=0){
            rem=temp%10;
            sum+=rem;
            switch(rem){
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("one ");
                    break;
                case 2:
                    System.out.print("two ");
                    break;
                case 3:
                    System.out.print("three ");
                    break;
                case 4:
                    System.out.print("four ");
                    break;
                case 5:
                    System.out.print("five ");
                    break;
                case 6:
                    System.out.print("six ");
                    break;
                case 7:
                    System.out.print("seven ");
                    break;
                case 8:
                    System.out.print("eight ");
                    break;
                case 9:
                    System.out.print("nine ");
                    break;
            }
            temp=temp/10;
            
            
            
        }
        
    }
            
    
}
