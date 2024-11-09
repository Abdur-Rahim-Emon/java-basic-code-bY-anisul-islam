
package CF;

import java.util.Scanner;

public class AntonandPolyhedrons {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int n,sum=0;
        n=in.nextInt();
      ///  char c=in.next().charAt(0);
        String[] s=new String[n];
        for (int i = 0; i <n; i++) {
            s[i]=in.next();
            if(s[i].equals("Tetrahedron"))
                sum=sum+4;
            else if(s[i].equals("Cube"))
                sum=sum+6;
            else if(s[i].equals("Octahedron"))
                sum=sum+8;
            else if(s[i].equals("Dodecahedron"))
                sum=sum+12;
            else if(s[i].equals("Icosahedron"))
                sum=sum+20;
        }
        System.out.println(sum);
    }
}
