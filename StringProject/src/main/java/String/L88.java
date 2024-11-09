
package String;

public class L88 {
    public static void main(String[] args) {
        String s1="       ARe ifffa ";
        System.out.println(s1);
        //String s2="iffa ";
        String s2= s1.trim();
        System.out.println(s2);
        char ch=s1.charAt(0);
        System.out.println(ch);
        int ps=s2.codePointAt(0);
        System.out.println(" o index assci "+ps);
        int i=s2.indexOf("iff");
        System.out.println("index of iff "+i);
         i=s2.lastIndexOf("a");
        System.out.println("last index "+i);
        
        
    }
    
}
