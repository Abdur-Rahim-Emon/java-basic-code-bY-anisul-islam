class Copy{
    int a;
    String b;
    Copy(int x,String s1){//method as peremeterized constractor 
        a=x;//assign the value
        b=s1;
        System.out.println(a+" "+b);
    }
    Copy (Copy ref){//copy constractor copy obj of ref1 to ref2
        a=ref.a;
        b=ref.b;
        System.out.println("ref 1 copy are ");
       System.out.println(a+"   "+b);
    }

}
/**
 * CopyConstractorL5
 */
public class CopyConstractorL5 {
    public static void main(String[] args) {
          Copy ref1=new Copy(1313,"ARE");
          Copy ref2=new Copy(ref1);
    }

    
}