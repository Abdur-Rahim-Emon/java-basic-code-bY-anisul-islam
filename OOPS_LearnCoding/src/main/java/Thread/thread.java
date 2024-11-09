
package Thread;
class t extends Thread  { 
    @Override 
    public void run() {
        for (int i = 0; i <6; i++) {
            System.out.println(".........i am ARE ....! ");
        
        }
        
    }
}

public class thread {
    public static void main(String[] args)throws InterruptedException  {
        t d=new t();
        d.start();
        for (int i = 0; i <5; i++) {
            System.out.println("...........i am sazzad .........");
            //Thread.sleep(1000);
        }
        
    }
    
}
