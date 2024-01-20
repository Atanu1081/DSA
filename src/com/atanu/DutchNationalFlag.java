package com.atanu;

import java.util.Arrays;

/**
 * @author Atanu
 */
public class DutchNationalFlag {

    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 2, 2, 1, 0, 1, 1};
        int[] arr1 = {1, 2, 0, 2, 2, 1, 0, 1, 1};

        printArray(arr);
        sort1(arr);
        printArray(arr);

        printArray(arr1);
        sort2(arr1);
        printArray(arr1);
    }

    // TC : O(2n)
    // SC : O(1)
    private static void sort1(int[] arr) {
        int c0 = 0;
        int c1 = 0;
        int c2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                c0++;
            else if (arr[i] == 1)
                c1++;
            else
                c2++;
        }
        for (int i = 0; i < c0; i++) {
            arr[i] = 0;
        }
        for (int i = c0; i < c0+c1; i++) {
            arr[i] = 1;
        }
        for (int i = c0+c1; i < arr.length; i++) {
            arr[i] = 2;
        }
    }

    // TC : O(n)
    // SC : O(1)
    private static void sort2(int[] arr) {
        int i = 0;
        int j = 0;
        int k = arr.length-1;
        while (i <= k) {
            if (arr[i] == 0) {
                swap(arr, i, j);
                i++;
                j++;
            }
            else if (arr[i] == 1)
                i++;
            else {
                swap(arr, i, k);
                k--;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    private static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
