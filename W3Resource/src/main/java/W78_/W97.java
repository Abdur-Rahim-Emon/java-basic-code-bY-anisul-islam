
package W78_;

import java.util.Arrays;

public class W97 {
    public static void main(String[] args) {
        int[] a={1,2,4,2,5};
        System.out.println("input arraay "+Arrays.toString(a));
        for (int i = 0; i <a.length-1; i++) {
            if(a[i]==a[i+1] || a[i]==a[i+2]){
                System.out.println("true");
                break;
            }
            
        }
                
                
    }
}
    
          
    
    

