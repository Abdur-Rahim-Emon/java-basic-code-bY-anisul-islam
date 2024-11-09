
package File_create;
import java.io.*;
public class test {
    public static void main(String[] args) {
        try{
             FileWriter f=new FileWriter("F:\\ test.txt");
             try{
             f.write("I am Abdur Rahim Emon . \nI am from BD");
             }
             finally{
                 f.close();
             }
        }
       catch(IOException e){
           System.out.println(e);
       }
    }
    
}
