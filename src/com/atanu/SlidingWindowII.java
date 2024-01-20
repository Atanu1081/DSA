package com.atanu;


import java.util.Arrays;

/**
 * @author Atanu
 */
public class SlidingWindowII {
    public static void main(String[] args) {
        int[] arr = {1, 4, 0, 0, 3, 10, 5};
        int[] arr1 = {1, 4};

        System.out.println(test1(arr1, 5));
        System.out.println(test2(arr1, 5));
    }

    // TC : O(n2)
    // SC : O(1)
    private static boolean test1(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
                if (k == sum) {
                    return true;
                }
            }
        }
        return false;
    }

    // TC : O(n)
    // SC : O(1)
    private static boolean test2(int[] arr, int k) {
        int sum = 0, s = 0;
        for (int e = 0; e < arr.length; e++) {
            sum = sum + arr[e];
            while (sum > k) {
                sum = sum - arr[s];
                s++;
            }
            if (k == sum) {
                return true;
            }
        }
        return false;
    }


    private static void print(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
