
package CF;

import java.util.Scanner;

public class FoxAndSnake {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i % 2 != 0) {
                    System.out.print("#");
                } else {
                    if (i % 4 == 2) {
                        if (j < m)
                            System.out.print(".");
                        else
                            System.out.print("#");
                    } else {
                        if (j == 1)
                            System.out.print("#");
                        else
                            System.out.print(".");
                    }
                }
            }
            System.out.println();
        }
        in.close();
    }
}
