package com.atanu;

/**
 * @author Atanu
 */
public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 30, 30, 30};
        int[] arr1 = {1,1,2};

        System.out.println(removeDuplicates1(arr1));
        System.out.println(removeDuplicates2(arr1));
    }

    // TC : O(n)
    // SC : O(n)
    private static int removeDuplicates1(int[] arr) {
        int[] temp = new int[arr.length];
        temp[0] = arr[0];
        int res = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != temp[res-1]) {
                temp[res] = arr[i];
                res++;
            }
        }
        return res;
    }

    // TC : O(n)
    // SC : O(1)
    private static int removeDuplicates2(int[] arr) {
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i-1]) {
                count++;
            }
        }
        return count;
    }
}
