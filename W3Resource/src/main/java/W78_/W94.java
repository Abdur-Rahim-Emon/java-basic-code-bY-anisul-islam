package W78_;

import java.util.Arrays;

public class W94 {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        int temp;
        System.out.println("first array : "+Arrays.toString(a));
        for (int i = 0; i <a.length; i++) {
            for (int j =i+1; j < a.length; j++) {
                
            
            if(a[i]%2==0 && a[j]%2==1){
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                
            }
            }
        }
        
        System.out.println("outpur: "+Arrays.toString(a));
        }
    }


