
package Throw;
class ARE extends Exception{
    ARE(String msg){
        System.out.println("yes cought the exceptions ");
        
    }
}
public class t 
{
    static void div(int a,int b)throws ARE {
       
        if(b==5){
     throw new ARE("dfkjadskfj");
        }
        else{
            System.out.println(a/b);
        }
        
    }
    public static void main(String[] args) {
        try{
             div(10,2);
        }
        catch(Exception e){
            System.out.println(e);
        }
       
    }
    
}
