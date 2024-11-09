
package Recursion;

public class R {
   int fact (int x){
       if(x==1){
           return 1;
       }
       else
           return x*fact(x-1);
   }
    public static void main(String[] args) {
        R r1=new R();
        System.out.println(r1.fact(6));
        System.out.println(r1.fact(5));
    }
    
}
