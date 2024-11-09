
package Exception_Handling;

public class NPE {
    
    public static void main(String[] args) throws InterruptedException
    {
       
        System.out.println("the start progrm");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            Thread.sleep(1000);
                  }
     
            System.out.println("finish");
        
        
        
    }
    
}
