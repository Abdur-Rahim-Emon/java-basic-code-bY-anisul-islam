
package execution;
import java.util.Scanner;

public class L13A {
   public static void main(String[] args){
       int id;
       String title;
       float price;
       String description;
       String category;
       Scanner input = new Scanner(System.in);
       id=input.nextInt();
       title =input.next();
       description=input.nextLine();
       //category =input.nextLine();
       System.out.printf("id = %d  \n title=%s \n d= %s\n",id,title,description);
       
       
   }
}
