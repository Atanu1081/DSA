package com.atanu;


import java.util.Arrays;

/**
 * @author Atanu
 */
public class EquilibriumPoint {
    public static void main(String[] args) {
        int[] arr = {4, 2, -2};
        int[] arr1 = {3, 4, 8, 9, -9, 7};

        System.out.println(equilibriumPoint1(arr1));
        System.out.println(equilibriumPoint2(arr1));
    }

    // TC : O(n2)
    // SC : O(1)
    private static boolean equilibriumPoint1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int ls = 0, rs = 0;
            for (int j = 0; j < i; j++) {
                ls += arr[j];
            }
            for (int j = i+1; j < arr.length; j++) {
                rs += arr[j];
            }
            if (ls == rs)
                return true;
        }
        return false;
    }

    // TC : O(n)
    // SC : O(1)
    private static boolean equilibriumPoint2(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int rs = sum;
        int ls = 0;
        for (int i = 0; i < arr.length; i++) {
            rs -= arr[i];
            if (ls == rs)
                return true;
            ls += arr[i];
        }
        return false;
    }


    private static void print(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
