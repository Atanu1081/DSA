package com.atanu;

import java.util.Arrays;

/**
 * @author Atanu
 */
public class SegregateZeroes {

    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 0, 1, 0};
        int[] arr1 = {8, 4, 0, 0, 2, 0};

        print(arr1);
        segregateZeroes1(arr1);
        print(arr1);

        print(arr);
        segregateZeroes2(arr);
        print(arr);

    }

    // TC : O(n2)
    // SC : O(1)
    private static void segregateZeroes1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                for (int j = i+1; j < arr.length; j++) {
                    if (arr[j] != 0) {
                        int temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                    }
                }
            }
        }
    }

    // TC : O(n)
    // SC : O(1)
    private static void segregateZeroes2(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp  = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
    }

    private static void print(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
