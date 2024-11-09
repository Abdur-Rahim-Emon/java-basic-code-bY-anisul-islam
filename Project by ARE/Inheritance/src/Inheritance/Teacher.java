package Inheritance;

public class Teacher extends Common {
     String email;
     String address;
    Teacher(String name, int age, String email ,String address) {

        super(name,age);
        this.email = email;
       this.address = address;

    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String status) {
        this.address = address;
    }
    public String toString() {
        return "Teacher name : "+getName()+"Teacher age : "+getAge()+" email : "+getEmail()+"status : "+getAddress();
    }
}
