
package File_Rename;

import java.io.*;
public class test {
    public static void main(String[] args) {
        File f=new File("F:\\Textfile\\ my1text.txt");
        File r=new File("F:\\Textfile\\ .txt");
        
            System.out.println(f.renameTo(r));
        System.out.println("yes");
        
    }
    
}
