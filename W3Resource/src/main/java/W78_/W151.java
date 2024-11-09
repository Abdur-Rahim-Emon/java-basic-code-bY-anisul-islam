
package W78_;


public class W151 {
    public static void main(String[] args) {
        int r;
        System.out.println("(100+0)/3 : "+(100+0)/3);
        System.out.println("3.0e-6*1000000.1 ="+3.0e-6 * 10000000.1);
        Boolean a=true,b=true;
        
        Boolean c=(a && b);
        System.out.println(c);
        c=(false && false) || (true && true);
        System.out.println("(false && false) || (true && true)="+c);
        c=(false || false) && (true && true);
        System.out.println("(false || false) && (true && true)="+c);
        double f=(double)345/4;
        System.out.println(f);
    }
    
}
