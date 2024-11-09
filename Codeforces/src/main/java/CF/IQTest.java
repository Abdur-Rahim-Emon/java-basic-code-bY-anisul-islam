
package CF;

import java.util.ArrayList;
import java.util.Scanner;

public class IQTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt( );
        ArrayList<Integer> a = new ArrayList<Integer>();
        int x;
        int e1;
        for (int i = 0; i <n; i++) {
            x=in.nextInt();
            a.add(x);
        }
        int odd=0,even=0,count=0;
        for (int i = 0; i <n; i++) {
            e1=a.get(i);
            if(e1%2==0)
            {
                count++;
                odd=e1;
            }
            else
            {
                even=e1;
            }
            
            
        }
        int len=a.size();
        int count1=len-count;
        int index;
        if(count1>count)
        {
            System.out.println(""+(a.indexOf(odd)+1));
        }
        else
             System.out.println(""+(a.indexOf(even)+1));
        
    }
    
}
