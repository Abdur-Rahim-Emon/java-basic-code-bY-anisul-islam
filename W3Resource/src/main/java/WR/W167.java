
package WR;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class W167 {
    public static void main(String[] args) {
        int x;
        Scanner in = new Scanner(System.in);
     ArrayList<Integer> a=new ArrayList<>();
        for (int i = 0; i <7; i++) {
            x=in.nextInt();
            a.add(x);
        }
     
         int count=0;
        System.out.println("orginal array are : "+a);
        for (int i = 0; i <a.size(); i++) {
            if(a.get(i)==0)
                a.remove(i);
            count++;
        }
        for (int i = 0; i <count; i++) {
            a.add(0);
        }
        System.out.println("result array are  : "+a);
    }
}
