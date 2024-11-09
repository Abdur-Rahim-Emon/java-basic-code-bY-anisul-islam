
package W78_;

public class W154 {
    public static void main(String[] args) {
        Boolean[][] a={{true,false,true},{false,true,false}};
        int lenth=a.length;//
        int columlenth=a[0].length;
        
        for (int i = 0; i <lenth; i++) {
            for (int j = 0; j <columlenth; j++) {
                if(a[i][j])
                System.out.print("t ");
                else
                    System.out.print("f ");
            }
            System.out.println("");
            
        }
        
    }
    
}
