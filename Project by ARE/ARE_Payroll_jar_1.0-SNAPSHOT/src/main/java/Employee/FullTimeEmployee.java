
package Employee;

public class FullTimeEmployee extends Employee {
    private double salary;
    FullTimeEmployee(int id,String name,double salary){
        super(id,name);
        this.salary=salary;
        
    }
    @Override
    public double calculationSalary(){
         System.out.println("****** Full time Employee *******");
        return salary;
       
    }
    
    
}
