package com.atanu;

public class FirstOccurrence {

    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 7, 7, 9};

        System.out.println(linear(arr, 7));
        System.out.println(binary(arr, 7));
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
    public static int binary(int[] arr, int x) {
        int low = 0;
        int high = arr.length-1;
        while (low <= high) {
            int mid = (low+high)/2;
            if (x > arr[mid])
                low = mid+1;
            else if (x < arr[mid])
                high = mid-1;
            else {
                if (mid == 0 || arr[mid-1] != arr[mid])
                    return mid;
                else
                    high = mid-1;
            }
        }
        return -1;
    }
}
