
package StaticPart3;

public class CountTest {
    public static void main(String[] args) {
        Count s1=new Count("Abdur",21);
        Count s2=new Count("RAhim",22);
        Count s3=new Count("Emon",21);
        Count s4=new Count("ARE",20);
        Count s5=new Count("Ainul",40);
        s1.show();
        s2.show();
        s3.show();
        s4.show();
        s5.show();
        System.out.println("the number student data entry in database "+Count.num);
        
    }
}
