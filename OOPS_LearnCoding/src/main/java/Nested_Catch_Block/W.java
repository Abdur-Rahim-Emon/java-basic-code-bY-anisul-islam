
package Nested_Catch_Block;


public class W {
    public static void main(String[] args) {
        System.out.println("start the program ");
        try{
            int[] a=new int[1];
            a[0]=3;
            a[1]=4;
            System.out.println("the value of array are : "+a[0]+a[1]);
        }
        catch(Exception e){
            System.out.println(e);
            try{
                String[] s= new String[1];
                s[0]="fdsfj";
                s[1]="aare";
                System.out.println("string are : "+s[0]+s[1]);
            }
            catch(NullPointerException x){
                System.out.println(x);
            }
        }
        finally{
            System.out.println("always print ");
        }
        System.out.println("termination ");
    }
}
