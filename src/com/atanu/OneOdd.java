package com.atanu;

/**
 * @author Atanu
 */
public class OneOdd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3, 2, 4};

        System.out.println(oneOdd1(arr));
        System.out.println(oneOdd2(arr));
    }

    // TC : O(n2)
    // SC : O(1)
    private static int oneOdd1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i])
                    count++;
            }
            if (count % 2 != 0)
                return arr[i];
        }
        return -1;
    }

    // TC : O(n)
    // SC : O(1)
    private static int oneOdd2(int[] arr) {
        int res = arr[0];
        for (int i = 1; i < arr.length; i++) {
            res ^= arr[i];
        }
        return res;
    }
}
