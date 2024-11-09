
package Varargs;

public class VR {
 int sum=1;
int get(int ... num){
    sum=1;
    for (int i:num) {
        sum =sum*i;
        
    }
    return sum;
    
    
    
        
    }
      public static void main(String[]args){
           VR r1=new VR();
          System.out.println(r1.get(10,20,30,30,40,50));
          System.out.println(r1.get(10,2,3,3,4,5));


         
      }
    
    
}
