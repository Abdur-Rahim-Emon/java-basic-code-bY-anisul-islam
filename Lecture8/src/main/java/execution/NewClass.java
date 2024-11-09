
package execution;

//import java.util.Arrays;

import java.util.Arrays;



public class NewClass {
    public static void main(String[] args) {
        String[] x={"zff","dkfjd","kdfjdf"};
        String[] y={"zff","dkfjd","kdfjdf"};
        System.out.println("besore sorting the string ");
        for (int i = 0; i < 3; i++) {
            System.out.println(" "+x[i]);
        }
        
        System.out.println("after sorting the strng ");
        Arrays.sort(x);
               for(int i=0; i<3; i++)
        {
            System.out.println(" "+x[i]);
        }
    }
    
}
