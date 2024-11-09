
package execution;


import java.util.ArrayList;
import java.util.Scanner;

public class L83ArrayListPart2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       /* ArrayList<Double> num=new ArrayList<>();
        num.add(2.33);
        num.add(4.33);
        num.add(6.33);
        num.add(9.33);
        num.add(4,5959.004);
        Iterator itr=num.iterator();
        System.out.println("printing using iterator");
        for (int i=0; i<5; i++) {
            System.out.println(" "+itr.next());
            
        }
       //num.clear();
        System.out.println("array list are "+num);
        boolean check=num.isEmpty();
        System.out.println("array list empty : "+check);
           boolean contain=num.contains(9.33);
           System.out.println("9.33 contain in array : "+contain);
           int pos=num.indexOf(9.33);
           System.out.println("positon of 9.33 is "+pos);
        num.set(4,55.2);
        System.out.println("array list are "+num);
        double x=num.get(0);
        System.out.println("setting the value 0 index "+x);*/
       ArrayList<Integer> num= new ArrayList<>();
       num.add(10);
       num.add(20);
       num.add(40);
       num.add(3,89);
        System.out.println(" array are "+num);
       // num.clear();
        System.out.println(" array are"+num);
        int index=num.indexOf(20);
        System.out.println(" index is "+index);
        boolean x=num.isEmpty();
        System.out.println("array is empty "+x);
        num.set(0,55);
        System.out.println(" array are "+num);
        int r=num.get(0);
        System.out.println("return array are "+r);
        boolean y=num.contains(20);
        System.out.println(" is contain "+y);
       
        
    }
    
}
