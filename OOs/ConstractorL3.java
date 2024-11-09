class A{
    int a; String s;
    A(){// we cannot use constractor compiler set automatic constractor 
         a=0;  s="null";
    }
   public void show(){
    System.out.print(a+" "+s);
   }

}

public class ConstractorL3 {

     public static void main(String[] args) {
          A ref=new A();// here A( ) is called constractor it is used fro obj initialize
          ref.show();
     }
}