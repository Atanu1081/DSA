package com.atanu;


import java.util.Arrays;

/**
 * @author Atanu
 */
public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 0, 1, 1};

        System.out.println(consec1s1(arr));
        System.out.println(consec1s2(arr));
    }

    // TC : O(n2)
    // SC : O(1)
    private static int consec1s1(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] == 1)
                    count++;
                else
                    break;
            }
            res = Math.max(res, count);
        }
        return res;
    }

    // TC : O(n)
    // SC : O(1)
    private static int consec1s2(int[] arr) {
        int res = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count = 0;
            }
            else {
                count++;
                res = Math.max(res, count);
            }
        }
        return res;
    }

    private static void print(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
