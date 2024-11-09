
package CF;


import java.util.Scanner;

public class cAPSlOCK {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String s = new String();
        String s1 = new String();
        String s2 = new String();
        String s3 = new String();
        String s4 = new String();
        s=in.next();
        s1=s.toUpperCase();
        
     
        char ch=s.charAt(0);
        
        if( s1.equals(s))
            System.out.println(""+s.toLowerCase());
       
        else
        {
            if(Character.isUpperCase(ch))
            {
                System.out.println(s);
            }
            else 
            {
                char upper=Character.toUpperCase(ch);
                s4=upper+s.substring(1);
               // System.out.println(s4);
               
                if(Character.isLowerCase(ch) && s4.equals(s1))
                {
                    
                    s2=s.toLowerCase();
                                  s3=upper+s2.substring(1);
                    System.out.println(s3);
                }
                
                else
                    System.out.println(s);
               
            }
            
        }
        
        
    }
 
}