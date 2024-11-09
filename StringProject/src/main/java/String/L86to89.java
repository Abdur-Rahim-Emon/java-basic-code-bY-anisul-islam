
package String;

public class L86to89 {
    public static void main(String[] args) {
        String s1="are are";
        String s4="Are are";
        String s2="To sday ";
      
        String s3=s1+s2;
        System.out.println("s3 "+s3);
        System.out.println(" s3 cat "+(s1.concat(s2)));
        s3.trim();
        System.out.println(" s3"+s3);
        char ch=s3.charAt(0);
        System.out.println("ch at  0 index"+ch);
        int pos=s3.length();
        System.out.println("lenth of s3 "+s3);
        pos=s3.codePointAt(1);
        System.out.println("ascii value of index 1 "+pos);
        boolean b=s3.startsWith("ar");
        System.out.println("is s3 start with ar "+b);
        b=s3.endsWith("ay");
        System.out.println("is s3 ends with ay: "+b);
        b=s1.equals(s2);
        System.out.println("is s1 and s2 equal "+b);
        b=s1.contains(s3);
        System.out.println("is s1 and s3 same : "+b);
        b=s1.equalsIgnoreCase(s4);
        System.out.println(" s1 and s4 are same diif in case "+b);
        b=s1.isEmpty();
        System.out.println("s1 is empty"+b);
        if(b==false)
            System.out.println("yes corect ");
        String s5=s3.replace('a','i');
        System.out.println("replace string "+s5);
        String[] s6 =s3.split(" ");
        for(String x:s6)
        {
            System.out.println("rep "+x);
        }
        String s7=s3.toLowerCase();
        System.out.println(" low "+s7);
        
        
        
        
    }
    
}
