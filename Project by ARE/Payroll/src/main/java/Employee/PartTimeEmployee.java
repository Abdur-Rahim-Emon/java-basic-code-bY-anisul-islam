
package Employee;

public class PartTimeEmployee extends Employee {
    private double salary;
   /// private double workinghour;
    PartTimeEmployee(int id,String name,double salary){
        super(id,name);
        this.salary=salary;
      //  this.workinghour=workinghour;
    }
    @Override
    public double calculationSalary(){
        System.out.println("**** Student details ****** ");
        return salary;
        
    }
  
    
}
