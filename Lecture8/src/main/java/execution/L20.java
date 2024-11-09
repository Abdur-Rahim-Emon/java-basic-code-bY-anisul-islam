
package execution;

public class L20 {
    public static void main(String[] args) {
        int n=-12;
        int r;
        r=-n;
        System.out.print("unary negative = "+r);
        r=+n;
        System.out.print("\nunary Positive = "+r);
        // increment and decrement
        int x=20;
        int y;
        y=x++;
        System.out.print("\nunary Positive = "+y);
        y=x;
        System.out.print("\nunary Positive = "+y);
        
        y=++x;
        System.out.print("\nunary Positive = "+y);
        
        
    }
    
}
