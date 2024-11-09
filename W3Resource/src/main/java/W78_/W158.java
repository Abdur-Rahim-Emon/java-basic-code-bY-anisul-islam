
package W78_;
public class W158 {
    public static boolean prime1(int x){
        //int r=0;
        if(x==0 || x==1)
            return false;
        for (int i =2; i <=Math.sqrt(x); i++) {
            if(x%i==0)
                return false;
        }
        return true;
        
    }
       
    public static void main(String[] args) {
        int n=5;
        boolean[][] b=new boolean[n][n];
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n; j++) {
                
                if(prime1(i) && prime1(j)){
               b[i][j]=false;
                System.out.print(b[i][j]+" ");
                   // System.out.print(prime1(i)+" "+prime1(j)+" ");
                }
                else
                {
                   b[i][j]=true;
                    System.out.print(b[i][j]+" ");
                   // System.out.print(prime1(i)+" "+prime1(j)+" ");
                }
            }
            System.out.println("");
        }
        //System.out.println(2%1);
        System.out.println(prime1(4));
      
    }
} 

       
    

