package W78_;

import java.util.*;

public class W99 {

    public static void main(String[] args) {
        int[] array_nums = {20, 20, 10, 30, 40, 20, 50};
        System.out.println("input array : " + Arrays.toString(array_nums));
        int result = 0;

        int x = 20;

        for (int i = 0; i < array_nums.length - 1; i++) {

            if ((array_nums[i] != x && array_nums[i + 1] !=x)) {
                result = 1;
            } 

        }

        if (result == 0) {
            System.out.printf(String.valueOf(true));
        } else {
            System.out.printf(String.valueOf(false));
        }
    }
}
