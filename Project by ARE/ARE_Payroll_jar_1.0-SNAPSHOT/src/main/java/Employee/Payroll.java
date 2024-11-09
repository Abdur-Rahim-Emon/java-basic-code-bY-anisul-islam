
package Employee;

import java.util.ArrayList;

public class Payroll {
    private ArrayList <Employee> employeelist ;
    public Payroll(){
        employeelist=new ArrayList<>();
    }
    public void addemployee(Employee e){
        employeelist.add(e);
    } 
    public void removeemployee(int id){
        int i=0;
        Employee employeeremove=null;
        for(Employee e1: employeelist){
            if(e1.getId()==id){
                i=-1;
                employeeremove=e1;
                break;
            }
        }
        if(i==-1){
            employeelist.remove(employeeremove);
        }
        
    }
    public void showemployee(int id){
       // System.out.println("start");
        for(Employee e1:employeelist){
            if(e1.getId()==id)
            System.out.println(e1);
           // System.out.println("1");
        }
       //System.out.println(employeelist.size());
    }
    public void showtotalemployee(){
        System.out.println("total employee : "+employeelist.size());
    }
    public void showfullemployee(){
        for(Employee e:employeelist){
            System.out.println(e);
        }
    }
}
