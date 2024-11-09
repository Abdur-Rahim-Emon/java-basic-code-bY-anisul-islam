
package FileReader;

import java.io.FileReader;
import java.util.Scanner;
import java.io.IOException;
public class Filea {
    public static void main(String[] args) {
        try{
        FileReader f=new FileReader("F:\\Textfile\\ mytext.txt");
            Scanner in = new Scanner(f);
            while(in.hasNextLine())
            {
                System.out.println(in.nextLine());
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    
}
