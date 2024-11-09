
package execution;

import java.util.ArrayList;

public class L84 {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        ArrayList<Integer> num1 = new ArrayList<Integer>();
         ArrayList<Integer> num2 = new ArrayList<Integer>();
         num.add(10);
         num.add(200);
         num.add(30);
         num.add(40);
         num.add(50);
         System.out.println("array num "+num);
         num1.add(10);
         num1.add(200);
         num1.add(30);
         num1.add(40);
         num1.add(50);
         System.out.println("array num1"+num1);
         num2.addAll(num1);
         System.out.println("array num2"+num2);
         boolean r=num2.equals(num);
         System.out.println("num and num2 are equal "+r);
    }
}
