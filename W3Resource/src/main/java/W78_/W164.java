
package W78_;


public class W164 {
    static double division(int x,int y){
        if(y==0){
            System.out.println();
            return 0;
        }
        int r=0;
        double f=0;
        while(x>y){
            x-=y;
            r++;
        }
        f=(double)x/y;
        f+=r;
        return f;
    }
    public static void main(String[] args) {
        int x=625;
        int y=25;
        System.out.println("dividend : "+x);
        System.out.println("divider  : "+y);
        System.out.println("result : "+division(x,y)); 
    }
    
}
