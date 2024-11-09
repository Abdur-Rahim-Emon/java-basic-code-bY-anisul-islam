
package CF;

import java.util.Scanner;


public class Registrationsystem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int n=in.nextInt();
       String[] s1=new String[n];
       StringBuilder s2=new StringBuilder();
       String s3=new String();
       for(int i=0; i<n; i++)
       {
           s3=in.next();
           s1[i]=s3;
           s2.append(s3);
       
        
       }
       String s4=s2.toString();
       String s5=new String();
      
       int count=0;
      for(int i=0; i<n; i++){
           if(s4.contains(s1[i]))
           {
               System.out.println("OK");
               s5=s1[i];
              
               
               s4=s4.replace(s5,"1");
               s1[i]="0";
               
           }
           else
           {
               System.out.println(""+(s1[i]+"1"));
               
               }
           }
      s4.repeat(count);
        System.out.println("count "+count);
       }
       
}