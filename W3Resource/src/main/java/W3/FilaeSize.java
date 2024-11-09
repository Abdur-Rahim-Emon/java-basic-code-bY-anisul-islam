
package W3;



import java.time.LocalTime;
import java.time.format.DateTimeFormatter;



public class FilaeSize {
    public static void main(String[] args) {
       LocalTime time= LocalTime.now();
        System.out.println(""+time);
       
        DateTimeFormatter format= DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.println(""+time.format(format));
    }
    
}
