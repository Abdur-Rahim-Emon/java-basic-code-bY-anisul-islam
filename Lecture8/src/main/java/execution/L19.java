
package execution;
import java.util.Scanner;
public class L19 {
    public static void main(String[] args)
    {
        Scanner in=new Scanner (System.in);
        float f;
        System.out.print("enter any number\n");
        f=in.nextFloat();
        double r;
        r=(f-32)/1.8;
        System.out.printf("temp at c is : %f",r);
        
    }
    
}
