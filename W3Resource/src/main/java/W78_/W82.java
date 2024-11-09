
package W78_;


public class W82 {
    public static void main(String[] args) {
        int[]a ={20,30,40,50,67};
       int max=a[0];
        if(max<a[a.length-1])
        {
           max=a[a.length-1];
        }
        if(max<a[a.length/2])
            max=a[a.length/2];
        System.out.println("Largest element between first, last, and middle values: "+max);
        
    }
}
