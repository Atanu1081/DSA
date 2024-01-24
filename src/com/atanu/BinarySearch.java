package com.atanu;

/**
 * @author Atanu
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1, 37, 9, 13, 37, 53, 37, 37};

        System.out.println(iterativeBinarySearch(arr, 37));
        System.out.println(recursiveBinarySearch(arr, 0, arr.length-1, 37));
        System.out.println(recursiveTernarySearch(arr, 0, arr.length-1, 37));
    }

    // TC: O(logn)
    // SC: O(1)
    private static int iterativeBinarySearch(int[] arr, int x) {
        int low = 0;
        int high = arr.length-1;
        while (low <= high) {
            int mid = (low+high)/2;
            if (x == arr[mid])
                return mid;
            else if (x > arr[mid])
                low = mid+1;
            else
                high = mid-1;
        }
        return -1;
    }

    // TC: O(logn) base2
    // SC: O(logn)
    private static int recursiveBinarySearch(int[] arr, int low, int high, int x) {
        if (low > high)
            return -1;
        int mid = (low+high)/2;
        if (x == arr[mid])
            return mid;
        else if (x > arr[mid])
            return recursiveBinarySearch(arr, mid+1, high, x);
        else
            return recursiveBinarySearch(arr, low, mid-1, x);
    }

    // TC: O(logn) base3
    // SC: O(logn)
    private static int recursiveTernarySearch(int[] arr, int low, int high, int x) {
        if (low > high)
            return -1;
        int mid1 = low + (high-low)/3;
        int mid2 = high - (high-low)/3;
        if (x == arr[mid1])
            return mid1;
        if (x == arr[mid2])
            return mid2;
        if (x < arr[mid1])
            return recursiveTernarySearch(arr, low, mid1-1, x);
        else if (x > arr[mid2])
            return recursiveBinarySearch(arr, mid2+1, high, x);
        else
            return recursiveBinarySearch(arr, mid1+1, mid2-1, x);
    }
}
