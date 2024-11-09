
package W78_;

import java.util.Arrays;

public class W93 {
    public static void main(String[] args) {
        int [] a={10,10,30,20,20};
        System.out.println("test array is : "+Arrays.toString(a));
        
        int len=a.length;
        int c10=0,c20=0;
        for (int i = 0; i <len; i++) {
            if(a[i]==10 && a[i+1]==10)
                c10++;
            else if(a[i]==20 && a[i]==20)
                c20++;
            if(c20>0 && c10>0)
                break;
            
        }
        if(c10==1 && c20==1)
            System.out.println("false");
        else
            System.out.println("true ");
        
    }
    
}
