
package execution;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class L83 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<Integer>();
        System.out.println(" size of array "+num.size());
        num.add(19);
        num.add(29);
        num.add(399);
        num.add(3,34);
        num.add(4,44);
        System.out.println("array list are "+num);
        System.out.println("");
        for (int i:num) {
            System.out.println(" element "+i);
            
        }
        Iterator itr =num.iterator();
        while(itr.hasNext())
        {System.out.println(" elsem of itr "+itr.next());
        
        }
        num.remove(0);
        System.out.println("after removing 0 index "+num);
        num.removeAll(num);
        System.out.println(" "+num);
         System.out.println(" size of array "+num.size());
       
    }
    
}
