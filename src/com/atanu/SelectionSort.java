package com.atanu;

import java.util.Arrays;

/**
 * @author Atanu
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {12, 3, 6, 99, 51};
        int[] arr1 = {1, 2, 3, 4, 5, 6};

        print(arr);
        selectionSort(arr);
        print(arr);
    }

    // TC : O(n2)
    // Sc: O(1)
    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int min_Index = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] > arr[min_Index])
                    min_Index = j;
            }
            swap(arr, min_Index, i);
        }
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
