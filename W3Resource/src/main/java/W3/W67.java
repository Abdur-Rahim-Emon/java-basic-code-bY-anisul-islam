package W3;

import java.util.Arrays;
import java.util.Scanner;

public class W67 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\ninput main word   : ");
        String s1=in.nextLine();
        //System.out.println("");
        System.out.print("\nInput the word : ");;
        
        String word=in.nextLine();
        int index=s1.indexOf('n');
        System.out.println("index of n   : "+index);
        String Mw= s1.substring(0,index+2)+word+s1.substring(index);
        System.out.println(Mw);
        
        
       
    }

}