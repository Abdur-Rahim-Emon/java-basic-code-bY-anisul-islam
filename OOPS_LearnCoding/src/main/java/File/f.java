
package File;
import java.io.File;
public class f {
    public static void main(String[] args) {
        File f=new File("E:\\Java learn coding");
        if(f.exists()){
            System.out.println("file path: "+f.getAbsolutePath());
            System.out.println("file name: "+f.getName());
          System.out.println("file "+f.toString());
        }
        else
        System.out.println("file not found");
    }
    
}
