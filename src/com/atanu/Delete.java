package com.atanu;

import java.util.Arrays;

/**
 * @author Atanu
 */
public class Delete {
    public static void main(String[] args) {
        int [] arr = new int [] {12, 3, 6, 99, 45, 53, 3};
        print(arr);
        delete(arr, 99);
        print(arr);

    }

    private static void print(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    // TC : O(n)
    // SC : O(1)
    private static void delete(int[] arr, int n) {
        int index = 0;
        for (int i = 0;  i < arr.length; i++) {
            if (n == arr[i]) {
                index = i;
            }
        }
        for (int i = index; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
        }
    }

}
