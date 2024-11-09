
package W3;




import java.util.Scanner;


public class W54 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter 1st digit ");
        int a=in.nextInt();
        System.out.println("enter 2nd digit ");
        int b=in.nextInt();
        System.out.println("enter 3rd digit ");
        int c=in.nextInt();
        
        boolean abc ;
        System.out.println("result   ");
        System.out.println(""+test(a,b,c));
    }
       public static boolean test(int p,int q,int r){
           if((p%10 == q%10) || (q%10 == r%10 )|| (r%10==p%10))
               return true;
           else
               return false;
       }
    }
    

