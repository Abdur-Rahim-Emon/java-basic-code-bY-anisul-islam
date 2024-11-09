
package execution;

import java.util.Scanner;

class a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" enter any method  maam :(+ or - or * or /): ");
        char c = in.next().charAt(0);
        System.out.println("enter any tow number : ");
        int n1,n2;
        n1=in.nextByte();
        n2=in.nextByte();
        switch(c)
                {
                    case '+':
                        System.out.printf(" sum are: %d",n1+n2);
                        break;
                    case '-':
                        System.out.printf(" dec are: %d",n1-n2);
                        break;
                    case '*':
                        System.out.printf(" multi are: %d",n1*n2);
                        break;
                    case '/':
                        System.out.printf(" sum are: %f",n1/n2);
                        break;
                        
                }
        
        
        
        
    }
    
}
