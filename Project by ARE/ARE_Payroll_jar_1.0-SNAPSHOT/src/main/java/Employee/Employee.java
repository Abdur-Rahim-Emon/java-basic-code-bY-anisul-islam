
package Employee;


public abstract class Employee {
    private String name;
    private int id;
    Employee(int id,String name){
        this.id=id;
        this.name=name;
    }
   public String getname(){
       return name;
   }
   public int  getId(){
       return id;
   }
   public abstract double calculationSalary();
    @Override
   public String toString() {
        return "Employee [name=" + name + ", id=" + id + ", salary=" + calculationSalary() + "]";
    }
}
