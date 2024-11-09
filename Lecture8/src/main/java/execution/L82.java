
package execution;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class L82 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> num=new ArrayList<>();
        ArrayList<Integer> num1=new ArrayList<>();
        num.add(100);
        num.add(1,20);
        num.add(30);
        System.out.println(num);
        Iterator itr=num.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());
        for(int i:num)
      System.out.println(i);
       Boolean b=num1.isEmpty();
        System.out.println("is empty "+b);
        int i=num.size();
        System.out.println(" "+i);
       int len=num.size();
        
        System.out.println("size of num"+len);
        num1.addAll(num);
        System.out.println(num1);
        num1.remove(2);
        System.out.println(num1);
        int x=num.indexOf(20);
        System.out.println(x);
        Collections.sort(num);
        System.out.println(num);
        Collections.sort(num,Collections.reverseOrder());
        System.out.println(num);
       
        
        
        
    }
    
}
