
package W78_;


public class W53 {
    public static void main(String[] args) {
        Integer a=25;
        System.out.println("inpurt first number : "+a );
        System.out.println("Binary rpresentation  : ");
        String s=Integer.toBinaryString(a);
        System.out.println(s);
        int count=0;
        for(char c:s.toCharArray()){
            if(c=='0')
                count++;
        }
        System.out.println("number of zero bits : "+count);
    }
}
