package com.atanu;

import java.util.Arrays;

/**
 * @author Atanu
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {12, 3, 6, 99, 51};
        int[] arr1 = {1, 2, 3, 4, 5, 6};

        print(arr1);
        insertionSort(arr1);
        print(arr1);
    }

    // TC : O(n2) -> O(n)
    // Sc: O(1)
    private static void insertionSort(int[] arr) {
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i-1;
            while (j >= 0 && arr[j] > key) {
                count++;
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        System.out.println("Count : " + count);
    }

    private static void print(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }


}
