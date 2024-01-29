package com.atanu;

import java.util.Arrays;

/**
 * @author Atanu
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {12, 3, 6, 99, 51};
        int[] arr1 = {1, 2, 3, 4, 5, 6};

        print(arr);
        bubbleSort(arr);
        print(arr);
    }

    // TC : O(n2) -> O(n)
    // Sc: O(1)
    private static void bubbleSort(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length-1; i++) {
            boolean swap = false;
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    count++;
                    swap = true;
                    swap(arr, j, j+1);
                }
            }
            if (!swap)
                break;
        }
        System.out.println("Count : " + count);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    private static void print(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }


}
