
package W3;

import java.util.Scanner;

public class W57 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("input an integer : ");
        int x=in.nextInt();
        int count=0;
        for(int i=1; i<=(int)Math.sqrt(x); i++){
            if(x%i==0 && i*i!=x)
                count+=2;
            else if(i*i==x)
                count++;
        }
        System.out.println("factor is : "+count);
        //System.out.println(""+(int)Math.sqrt(x));
    }
    
}
