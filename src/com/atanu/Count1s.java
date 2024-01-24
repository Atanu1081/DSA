package com.atanu;

public class Count1s {

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1, 1, 1};

        System.out.println(linear(arr));
        System.out.println(binary(arr));
    }

    // TC: O(n)
    // SC: O(1)
    private static int linear(int[] arr) {
        int count = 0;
        for (int j : arr) {
            if (1 == j)
                count++;
        }
        return count;
    }

    // TC: O(logn)
    // SC: O(1)
    private static int binary(int[] arr) {
        int first = FirstOccurrence.binary(arr, 1);
        return arr.length-first;
    }
}
