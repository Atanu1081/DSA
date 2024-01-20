package com.atanu;

/**
 * @author Atanu
 */
public class Frequency {

    public static void main(String[] args) {

        int[] arr = {10, 10, 10, 20, 20, 30};
        int[] arr1 = {10, 10, 10, 20, 20, 20, 30, 30};
        int[] arr2 = {10};
        int[] arr3 = {10, 10, 10};

        frequency(arr3);
    }

    // TC : O(n)
    // SC : O(1)
    private static void frequency(int[] arr) {
        int freq = 1, i = 1;
        while (i < arr.length) {
            while (i < arr.length && arr[i] == arr[i-1]) {
                freq++;
                i++;
            }
            System.out.println("Frequency of " + arr[i-1] + " is : " + freq);
            freq = 1;
            i++;
        }
        if (arr.length == 1 || arr[arr.length-1] != arr[arr.length-2])
            System.out.println("Frequency of " + arr[arr.length-1] + " is : " + freq);
    }
}
