package leetcode.Amazon.topcoder;

import java.util.Arrays;

/**
 * Sorting
 */
public class Sorting {

    public static void main(String[] args) {

        int[] sorted = bubbleSort(new int[] { 4, 7, 6, 9, 8, 1 });
        System.out.println(Arrays.toString(sorted));

        sorted = insertionSort(new int[] { 4, 7, 6, 9, 8, 1 });
        System.out.println(Arrays.toString(sorted));
    }

    public static int[] bubbleSort(int[] data) {

        int tmp = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 1; j < data.length - i; j++) {
                if (data[j - 1] > data[j]) {
                    tmp = data[j];
                    data[j] = data[j - 1];
                    data[j - 1] = tmp;
                }
            }
        }
        return data;
    }

    public static int[] insertionSort(int[] data) {

        for (int i = 1; i < data.length; i++) {
            int tmp = data[i];
            int j = i - 1;
            while (j > -1 && (data[j] > tmp)) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = tmp;
        }
        return data;
    }

    public static int[] heapSort(int[] data) {

        return null;
    }

    public static int[] quickSort(int[] data){
        return null;
    }

}