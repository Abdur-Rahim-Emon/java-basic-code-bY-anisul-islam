
package execution;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class L85 {
    public static void main(String[] args) {
      /*  ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(10);
        num.add(-90);
        num.add(90);
        num.add(70);
        num.add(0);
        num.add(10);
        Collections.sort(num);
        System.out.println(" "+num);
        Collections.sort(num,Collections.reverseOrder());
        System.out.println(" "+num);*/
      ArrayList<Integer> num= new ArrayList<>();
      ArrayList<Integer> num2= new ArrayList<>();
      num.add(4);
      num.add(6);
      num.add(9);
      num.add(3,67);
        System.out.println("array are"+num);
        Iterator itr=num.iterator();
        while(itr.hasNext())
        {  System.out.println(" "+itr.next());
        }
        for(int j:num)
        {
            System.out.println(" "+j);
        }
        
        System.out.println(" size of "+num.size());
       boolean b= num.contains(4);
        System.out.println(" contain "+b);
        b=num.isEmpty();
        System.out.println("is empty"+b);
        int index=num.indexOf(4);
        System.out.println("index of 4 "+index);
        num.addAll(num2);
        System.out.println("adding array in num2"+num2 );
    
          Collections.sort(num);
          System.out.println(" "+num);
          Collections.sort(num,Collections.reverseOrder());
          System.out.println("revese are "+num);
          num.set(0,5);
          System.out.println(" "+num);
          
          
              
    }
    
}
