package Inheritance;

public class Student extends Common{
     int id;
     String address;
    Student(String name,int id,int age,String address){
        super(name,age);
        this.id=id;
        this.address=address;

    }

    public int getId(){
        return id;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public void setId(int id){
        this.id=id;
    }
    public String toString(){
        return "name : "+getName()+"Id "+getId()+", age : "+getAge()+", address : "+getAddress();
    }
}
