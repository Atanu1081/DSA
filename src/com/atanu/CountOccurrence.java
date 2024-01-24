package com.atanu;

public class CountOccurrence {

    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 7, 7, 9};

        System.out.println(linear(arr, 7));
        System.out.println(binary(arr, 7));
    }

    // TC: O(n)
    // SC: O(1)
    private static int linear(int[] arr, int x) {
        int count = 0;
        for (int j : arr) {
            if (x == j)
                count++;
        }
        return count;
    }

    // TC: O(logn)
    // SC: O(1)
    private static int binary(int[] arr, int x) {
        int first = FirstOccurrence.binary(arr, x);
        int last = LastOccurrence.binary(arr, x);
        return last-first+1;
    }
}
