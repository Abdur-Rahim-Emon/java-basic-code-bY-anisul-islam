package FileReader;

import java.io.*;

public class file {

    public static void main(String[] args) throws Exception {

        File f = new File("F:\\Textfile\\ my1text.txt");
        if (f.createNewFile())
        {
            System.out.println("file created ");
        } else
        {
            System.out.println("file created successfully..! ");
        }
    

    FileWriter w = new FileWriter("F:\\Textfile\\ my1text.txt");

    w.write ("i am emon.");
w.close();
            

    FileReader r = new FileReader("F:\\Textfile\\ my1text.txt");

    int i;
    while((i  = r.read())!=-1){
                System.out.print((char) i);
    }
    r.close();

    System.out.println ("\n.......read successfully.....");    
}
        
        

    }


