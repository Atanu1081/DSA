package com.atanu;

public class RotatedSortedArray {

    public static void main(String[] args) {
        int[] arr = {10, 20, 40, 60, 5, 8};
        int[] arr1 = {1, 0, 1, 1, 1};

        //System.out.println(linear(arr, 5));
        System.out.println(binary(arr1, 0));
    }

    // TC: O(n)
    // SC: O(1)
    private static int linear(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i])
                return i;
        }
        return -1;
    }

    // TC: O(logn)
    // SC: O(1)
    private static int binary(int[] arr, int x) {
        int low = 0;
        int high = arr.length-1;
        while (low <= high) {
            int mid = (low+high)/2;
            if (x == arr[mid])
                return mid;
            if (arr[low] <= arr[mid]) {
                if (x >= arr[low] && x < arr[mid])
                    high = mid-1;
                else
                    low = mid+1;
            }
            else {
                if (x > arr[mid] && x <= arr[high])
                    low = mid+1;
                else
                    high = mid-1;
            }
        }
        return -1;
    }
}
