package base.array;

import java.util.Arrays;

public class doublearray {
    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[] arr2 = arr[0];
        for (int[] arrs : arr) {
            for (int x : arrs) {
                System.out.print( x);
            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println(arr[1][2]);
    }
}
