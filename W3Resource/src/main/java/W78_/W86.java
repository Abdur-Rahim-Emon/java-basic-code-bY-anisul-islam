package W78_;

import java.util.Scanner;

public class W86 {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        int temp = n;
        for (;;) {

            if (temp % 2 == 0)
            {
                temp = temp / 2;
                count++;
            } else
            {
                temp = temp * 3 + 1;

            }
            if (temp == 1)
            {
                break;
            }
        
        }
        System.out.println("number of process are : " +count);
    }

}
