
package W3;
import java.util.*;
public class W643 {
    


    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);

        
        System.out.print("Input the first number : ");
        int a = in.nextInt();  // Read and store the first number

       
        System.out.print("Input the second number: ");
        int b = in.nextInt();  // Read and store the second number

        
        System.out.println("Result: " + common_digit(a, b));
    }

    
    public static boolean common_digit(int p, int q) {
        
        if (p < 25 || q > 75) {
            return false;
        }

        
        int x = p % 10;
        int y = q % 10;

        
        p /= 10;
        q /= 10;

        
        return (p == q || p == y || x == q || x == y);
    }
}

    

