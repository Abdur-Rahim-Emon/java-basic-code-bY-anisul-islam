
package W3;

import java.util.Scanner;

public class W68 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nmain string is: ");
        String s1=in.nextLine();
        System.out.print("\nhow many times you want to copy : ");
        int n=in.nextInt();
        String c=new String();
        for (int i = 0; i <n; i++) {
            c+=s1;
            
        }
        System.out.println("\ncopy string is : "+c);
    }
    
}
