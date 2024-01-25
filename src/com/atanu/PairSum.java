package com.atanu;

public class PairSum {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(pairSum1(arr, 8));
        System.out.println(pairSum2(arr, 8));
    }

    // TC: O(n2)
    // SC: O(1)
    private static boolean pairSum1(int[] arr, int x) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (x == arr[i] + arr[j])
                    return true;
            }
        }
        return false;
    }

    // TC: O(n)
    // SC: O(1)
    private static boolean pairSum2(int[] arr, int x) {
        int left = 0;
        int right = arr.length-1;
        while (left < right) {
            if (x == arr[left] + arr[right])
                return true;
            else if (x > arr[left] + arr[right])
                left++;
            else
                right--;
        }
        return false;
    }
}
