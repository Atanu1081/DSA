package com.atanu;

/**
 * @author Atanu
 */
public class MajorityElement {

    public static void main(String[] args) {

        int[] arr = {8, 7, 6, 8, 6, 6, 6, 7};

        System.out.println(majority1(arr));
        System.out.println(majority2(arr));
    }

    // TC : O(n2)
    // SC : O(1)
    private static int majority1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            if (count > arr.length/2)
                return i;
        }
        return -1;
    }

    // TC : O(2n)
    // SC : O(1)
    private static int majority2(int[] arr) {
        // phase 1
        int res = 0, count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[res])
                count++;
            else
                count--;
            if (count == 0) {
                res = i;
                count = 1;
            }
        }
        // phase 2
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[res])
                count++;
        }
        if (count < arr.length/2)
            return -1;
        return res;
    }
}
