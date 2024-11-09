package Inheritance;

public class Common {
     String name;
     int age;
     static String university="Pstu";
    Common(String name, int age){
        this.name=name;
        this.age=age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public String getUniversity() {
        return university;
    }

}
