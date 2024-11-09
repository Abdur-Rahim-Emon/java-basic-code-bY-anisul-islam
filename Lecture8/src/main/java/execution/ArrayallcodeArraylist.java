
package execution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayallcodeArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> num1= new ArrayList<>();
        ArrayList<Integer> num2= new ArrayList<>();
        ArrayList<Integer> num3= new ArrayList<>();
        num1.add(10);
        num1.add(20);
        num1.add(30);
        num1.add(5);
        num1.add(50);
        num1.add(5,60);
        num2.add(10);
        num2.add(20);
        num2.add(30);
        num2.add(40);
        num2.add(50);
        num2.add(5,60);
        System.out.println(" "+num1);
        Iterator itr= num1.iterator();
        while(itr.hasNext())
        {
            System.out.println(" "+itr.next());
        }
        for(int i: num1){
            System.out.println(i);
        }
        boolean b=num1.isEmpty();
        System.out.println("is num1 is empty "+b);
        b=num1.equals(num2);
        System.out.println("num1 and num2 are same "+b);
        int p=num1.indexOf(10);
        System.out.println("index of 10 is "+p);
        num1.remove(0);
        System.out.println(" "+num1);
        //num1.removeAll(num1);
        num3.addAll(num1);
        System.out.println("ater rem "+num3);
        num3.set(0, 10);
        System.out.println(" num3 set "+num3);
        
        b=num1.contains(20);
        System.out.println("num1 contain 20 "+b);
        //sorting array 
        Collections.sort(num1);
        System.out.println("sortin num1 "+num1);
        Collections.sort(num1,Collections.reverseOrder());
        System.out.println(" rev "+num1);
        
        
        
    }
    
}
