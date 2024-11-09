
package String;

public class L90 {
    public static void main(String[] args) {
       /* StringBuffer sb=new StringBuffer("are");
        System.out.println(sb);
        sb.append("  ARE");
        sb.append(" ai");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.delete(0,5);
        System.out.println(sb);
        sb.setLength(20);
        System.out.println(sb);*/
       String s=new String("Abdur Rahim Emon");
       StringBuffer s1=new StringBuffer(s);
        System.out.println(s);
        s1.append(" Nilphamari");
        System.out.println(""+s1);
        s1.delete(0,5);
        System.out.println(""+s1);
        //s1.trimToSize();
        s1.setLength(20);
        System.out.println(""+s1);
        s1.reverse();
        System.out.println(""+s1);
        
        
       
    }
    
}
