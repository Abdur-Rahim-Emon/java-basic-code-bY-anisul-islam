
package CF;

import java.util.Scanner;

public class Dubstep {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s;
        s=in.next();//input string 
        String s1=s.replace("WUB"," ");//removing WUB
        //System.out.println(s1);
        String s2=s1.trim();//removing the first and last gap using trim 
        System.out.println(s2);
        
        
        
    }
    
}
