
package W3;


import java.util.Scanner;


public class W53 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter 1st digit ");
        int a=in.nextInt();
        System.out.println("enter 2nd digit ");
        int b=in.nextInt();
        System.out.println("enter 3rd digit ");
        int c=in.nextInt();
        System.out.println("enter result type ");
        boolean abc = in.nextBoolean();
        System.out.println("result   ");
        System.out.println(""+test(a,b,c,abc));
    }
       public static boolean test(int p,int q,int r,boolean xyz){
           if(xyz)
               return (r>q);
           else
               return (q>p && r>p );
       }
    }
    

