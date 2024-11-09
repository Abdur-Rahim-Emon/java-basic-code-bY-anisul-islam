
package W3;

import java.util.Scanner;

public class W62 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        System.out.println(""+result(a,b,c));
    }
    public static boolean result(int p,int q,int r){
    if(20<=((int)Math.abs(p-q))&& 20<= ((int)Math.abs(q-r)) && 20<= ((int)Math.abs(p-r)))
        return true;
        else
        return false;
    
}
    
}
