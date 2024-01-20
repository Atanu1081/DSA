package com.atanu;


import java.util.Arrays;

/**
 * @author Atanu
 */
public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = {5, -10, 6, 90, 3};
        int[] arr1 = {3, 8, -2, 4, -5, 6};

        System.out.println(prefixSum1(arr, 0, 3));
        System.out.println(prefixSum2(arr, 0, 3));
    }

    // TC : O(r-l+1)
    // SC : O(1)
    private static int prefixSum1(int[] arr, int l, int r) {
        int sum = 0;
        for (int i = l; i <= r; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // TC : O(n) + O(1)
    // SC : O(1)
    private static int prefixSum2(int[] arr, int l, int r) {
        int[] temp = new int[arr.length];
        temp[0] = arr[0];
        int sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
            temp[i] = sum;
        }
        return getSum(temp, l, r);
    }

    private static int getSum(int[] temp, int l, int r) {
        if (l == 0)
            return temp[r];
        return temp[r] - temp[l-1];
    }


    private static void print(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
