
package File_create;

import java.io.FileWriter;
import java.io.IOException;


public class New {
    



    public static void main(String[] args) {
        try{
             FileWriter f=new FileWriter("F:\\OneDrive\\Desktop");
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

    

