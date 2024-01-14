package com.atanu;

/**
 * @author Atanu
 */
public class LinearSearch {
    public static void main(String[] args) {
        int [] arr = new int [] {12, 3, 6, 99, 45, 53, 3};
        System.out.println(linearSearch(arr, 3));
    }

    // TC : O(n)
    // SC : O(1)
    private static int linearSearch(int[] arr, int n) {
        if (arr.length == 0) return -1;
        for (int i = 0; i < arr.length; i++) {
            if (n == arr[i]) {
                return i;
            }
        }
        return -1;
    }

}
