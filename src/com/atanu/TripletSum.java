package com.atanu;

public class TripletSum {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(tripletSum1(arr, 13));
        System.out.println(tripletSum2(arr, 13));
    }

    // TC: O(n3)
    // SC: O(1)
    private static boolean tripletSum1(int[] arr, int x) {
        for (int i = 0; i < arr.length-2; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if (x == arr[i] + arr[j] + arr[k])
                        return true;
                }
            }
        }
        return false;
    }

    // TC: O(n2)
    // SC: O(1)
    private static boolean tripletSum2(int[] arr, int x) {
        for (int i = 0; i < arr.length-2; i++) {
            if (isPair(arr, x - arr[i], i+1))
                return true;
        }
        return false;
    }

    private static boolean isPair(int[] arr, int x, int i) {
        int left = i;
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
