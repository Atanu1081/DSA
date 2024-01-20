package com.atanu;

/**
 * @author Atanu
 */
public class MaxEvenOddSubArray {

    public static void main(String[] args) {

        int[] arr = {5, 10, 12, 3, 2, 1};

        System.out.println(length1(arr));
        System.out.println(length2(arr));
    }

    // TC : O(n2)
    // SC : O(1)
    private static int length1(int[] arr) {
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i+1; j < arr.length; j++) {
                if ((arr[j] % 2 != 0 && arr[j-1] % 2 == 0) || (arr[j] % 2 == 0 && arr[j-1] % 2 != 0)) {
                    count++;
                    res = Math.max(res, count);
                }
                else
                    break;
            }
        }
        return res;
    }

    // TC : O(n)
    // SC : O(1)
    private static int length2(int[] arr) {
        int res = Integer.MIN_VALUE, count = 0;
        for (int j = 1; j < arr.length; j++) {
            if ((arr[j] % 2 != 0 && arr[j-1] % 2 == 0) || (arr[j] % 2 == 0 && arr[j-1] % 2 != 0)) {
                count++;
                res = Math.max(res, count);
            }
            else {
                count = 1;
            }
        }
        return res;
    }
}
