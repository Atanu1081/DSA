package com.atanu;

/**
 * @author Atanu
 */
public class TwoOdd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3, 2};

        twoOdd1(arr);
        twoOdd2(arr);
    }

    // TC : O(n2)
    // SC : O(1)
    private static int twoOdd1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i])
                    count++;
            }
            if (count % 2 != 0)
                System.out.println(arr[i]);
        }
        return -1;
    }

    // TC : O(n)
    // SC : O(1)
    private static void twoOdd2(int[] arr) {
        int res = arr[0];
        for (int i = 1; i < arr.length; i++) {
            res ^= arr[i];
        }
        int k = (res & (~res-1));
        int res1 = 0, res2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] & k) != 0)
                res1 ^= arr[i];
            else
                res2 ^= arr[i];
        }
        System.out.println(res1 + " " + res2);
    }
}
