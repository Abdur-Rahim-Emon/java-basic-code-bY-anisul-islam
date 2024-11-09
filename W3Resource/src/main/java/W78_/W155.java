package W78_;

import java.util.Scanner;

public class W155 {

    static void print(int[][] a) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
    }

    static void transpose(int[][] a) {
        int[][] b = new int[a.length][a[0].length];
        int row = b.length;
        int col = b[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
b[i][j]=a[j][i];
            }
            

        }
        print(b);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] a = new int[3][3];
        int row = a.length;
        int col = a.length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = in.nextInt();
            }

        }
        print(a);

        System.out.println("After changing the rows and columns of the said array: ");
transpose(a);
    }

}
