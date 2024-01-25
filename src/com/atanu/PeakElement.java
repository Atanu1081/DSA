package com.atanu;

public class PeakElement {

    public static void main(String[] args) {
        int[] arr = {6, 7, 8, 20, 12};

        System.out.println(peak1(arr));
        System.out.println(peak2(arr));
    }

    // TC: O(n)
    // SC: O(1)
    private static int peak1(int[] arr) {
        if (arr.length == 1)
            return arr[0];
        if (arr[0] >= arr[1]) return arr[0];
        if (arr[arr.length-1] >= arr[arr.length-2]) return arr[arr.length-1];
        for (int i = 1; i < arr.length-1; i++) {
            if ((arr[i] >= arr[i-1]) && (arr[i] >= arr[i+1]))
                return i;
        }
        return -1;
    }

    // TC: O(logn)
    // SC: O(1)
    private static int peak2(int[] arr) {
        int low = 0;
        int high = arr.length-1;
        while (low <= high) {
            int mid = (low+high)/2;
            if ((mid == 0 || arr[mid] >= arr[mid-1]) && (mid == arr.length-1 || arr[mid] >= arr[mid+1]))
                return mid;
            if (mid > 0 && arr[mid-1] >= arr[mid])
                high = mid-1;
            else
                low = mid+1;
        }
        return -1;
    }
}
