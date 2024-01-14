package com.atanu;

import java.util.Arrays;

/**
 * @author Atanu
 */
public class Insert {
    public static void main(String[] args) {
        int [] arr = new int [] {12, 3, 6, 99, 45, 53, 3};
        print(arr);
        insert(arr, 3, 101);
        print(arr);

    }

    private static void print(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    // TC : O(n)
    // SC : O(1)
    private static void insert(int[] arr, int pos, int n) {
        for (int i = arr.length-1;  i > pos; i--) {
            arr[i] = arr[i-1];
        }
        arr[pos] = n;
    }

}
