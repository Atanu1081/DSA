package com.atanu;


import java.util.Arrays;

/**
 * @author Atanu
 */
public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr = {5, -10, 6, 90, 3};
        int[] arr1 = {3, 8, -2, 4, -5, 6};

        System.out.println(test1(arr, 2));
        System.out.println(test2(arr, 3));
    }

    // TC : O(n2)
    // SC : O(1)
    private static int test1(int[] arr, int k) {
        int res = Integer.MIN_VALUE;
        for (int i = 0; i <= arr.length-k; i++) {
            int sum = 0;
            for (int j = 0; j < k; j++) {
                sum = sum + arr[i+j];
                res = Math.max(res, sum);
            }
        }
        return res;
    }

    // TC : O(n)
    // SC : O(1)
    private static int test2(int[] arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum = sum + arr[i];
        }
        int res = sum;
        for (int i = k; i < arr.length; i++) {
            sum = sum + arr[i] - arr[i-k];
            res = Math.max(res, sum);
        }
        return res;
    }


    private static void print(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
