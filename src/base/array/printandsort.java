package base.array;

import java.util.Arrays;

public class printandsort {
    public static void main(String[] args) {
        int[] arr = {1, 55, 112, 11515, 11216};
        //print
        for (int x : arr) {
            System.out.print(x);
        }
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.print(Arrays.toString(arr));
    }

    //冒泡 两两比较 每次少比较一个最大的
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                int temp = 0;
                if (arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void sortMy(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {
                int tmp;
                tmp = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = tmp;
            }
        }
    }
}
