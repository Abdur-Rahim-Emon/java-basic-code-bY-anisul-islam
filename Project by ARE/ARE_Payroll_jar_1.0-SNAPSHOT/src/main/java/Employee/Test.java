
package Employee;

import java.util.Scanner;


public class Test {
    public static void mainMenu(){
         System.out.println("*********************************************************************");
        System.out.println("welcome to payroll System ");
        System.out.println("*********************************************************************");
        System.out.println("1.Total Employee    2.Add FuLL Time Employee                  3.Remove Employeee    ");
        System.out.println("");
        System.out.println("4.Add Part Time Employee(search)     5.Show Employee(only one) ");
        System.out.println("");
        System.out.println("6.Main menu");
        System.out.println("");
        System.out.println("For exist press 0 ");
        System.out.println("");
        System.out.println("enter your choice: ");
        
    }
    public static void main(String[] args) {
      
      mainMenu();
        Payroll d1=new Payroll();
        int option=1;
        Scanner in = new Scanner(System.in);
        while(option!=0){
            option =in.nextInt();
        switch(option){//total emplpyee
              case 1:{
                d1.showtotalemployee();
                d1.showfullemployee();
                 mainMenu();
                break;
            }
            case 2://fulltime employee
            {
                int id;
                String name;
                double salary;
                System.out.print("Enter Employee id: ");
                id=in.nextInt();
                System.out.print("Enter Employee name: ");
                name=in.next();
                System.out.print("Enter Employee Salary: ");
                salary=in.nextDouble();
                FullTimeEmployee e1=new FullTimeEmployee(id,name,salary);
               // FullTimeEmployee e1=new FullTimeEmployee(1,"sdf",3.3);
            //  Payroll d1=new Payroll(); //when i will used i got error
                 d1.addemployee(e1);
                 //d.showemployee();
               
               mainMenu();
               break;
            }
            case 3://remove employee
            {
                int removeid;
                System.out.print("enter which id you want to remove : ");
                removeid=in.nextInt();
                d1.removeemployee(removeid);
                 mainMenu();
                 break;
                
            }
            case 4://parttimemployee 
            {
                int id;
                String name;
                double salary,hour;
                System.out.print("enter id: ");
                id=in.nextInt();
                System.out.print("enter name: ");
                name=in.next();
                System.out.print("enter salary: ");
                salary=in.nextDouble();
                System.out.print("enter working hour : ");
                hour=in.nextDouble();
                PartTimeEmployee e2=new PartTimeEmployee(id,name,salary,hour);
                d1.addemployee(e2);
                mainMenu();
                break;
            }
            case 5:
            {
               //  Payroll d1=new Payroll(); //and cannot get output
                System.out.print("enter id which deatails you want to print:   ");
                int id=in.nextInt();
                d1.showemployee(id);
                mainMenu();
                break;
            }
            case 7:
            {
                mainMenu();
                break;
            }
            default:
                mainMenu();
        } 
        
        }
       
 /* FullTimeEmployee e1=new FullTimeEmployee(1,"f",3.2);
    Payroll dis=new Payroll();
    dis.addemployee(e1);
    dis.showemployee();
    FullTimeEmployee e2=new FullTimeEmployee(2,"g",3.2);
   
    
   // dis.showemployee();
   Payroll d=new Payroll();
   Payroll d1=new Payroll();
   d.addemployee(e2);
   d1.addemployee(e2);
   d1.showemployee();*/
    
    
       
        
    }
    
}
