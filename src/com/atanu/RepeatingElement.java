package com.atanu;

import java.util.Arrays;

public class RepeatingElement {

    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 3, 2, 2};

        System.out.println(repeating1(arr));
        System.out.println(repeating2(arr));
        System.out.println(repeating3(arr));
        System.out.println(repeating4(arr));
    }

    // TC : O(n2)
    // SC : O(1)
    private static int repeating1(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    return arr[i];
            }
        }
        return -1;
    }

    // TC : O(nlogn)
    // SC : O(1)
    private static int repeating2(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == arr[i+1])
                return arr[i];
        }
        return -1;
    }

    // TC : O(nlogn)
    // SC : O(1)
    private static int repeating3(int[] arr) {
        boolean[] temp = new boolean[arr.length];
        for (int j : arr) {
            if (temp[j])
                return j;
            temp[j] = true;
        }
        return -1;
    }

    // TC : O(n)
    // SC : O(1)
    private static int repeating4(int[] arr) {
        int slow = arr[0]+1;
        int fast = arr[0]+1;
        do {
            slow = arr[slow]+1;
            fast = arr[arr[fast]]+1;
        } while (slow != fast);
        slow = arr[0]+1;
        while (slow != fast) {
            slow = arr[slow]+1;
            fast = arr[fast]+1;
        }
        return slow-1;
    }
}
