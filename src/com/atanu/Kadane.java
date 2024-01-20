package com.atanu;


import java.util.Arrays;

/**
 * @author Atanu
 */
public class Kadane {
    public static void main(String[] args) {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        int[] arr1 = {-7, -8, -16, -4, -8, -5, -7, -11, -10, -12, -4, -6, -4, -16, -10};

        System.out.println(maxSubArraySum1(arr1));
        System.out.println(maxSubArraySum2(arr1));
    }

    // TC : O(n2)
    // SC : O(1)
    private static int maxSubArraySum1(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = arr[j] + sum;
                res = Math.max(res, sum);
            }
        }
        return res;
    }

    // TC : O(n)
    // SC : O(1)
    private static int maxSubArraySum2(int[] arr) {
        int res = arr[0];
        int maxEnding = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxEnding = Math.max(maxEnding+arr[i], arr[i]);
            res = Math.max(res, maxEnding);
        }
        return res;
    }

    private static void print(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
