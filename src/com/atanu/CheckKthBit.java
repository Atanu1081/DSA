package com.atanu;

/**
 * @author Atanu
 */
public class CheckKthBit {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(checkKthBit1(n, 3));
        System.out.println(checkKthBit2(n, 3));
        System.out.println(checkKthBit3(n, 3));
    }

    // TC : O(k)
    // SC : O(1)
    private static boolean checkKthBit1(int n, int k) {
        int i = 1;
        for (int j = 1; j <= k-1; j++) {
            i = i * 2;
        }
        return (n & i) != 0;
    }

    // TC : O(1)
    // SC : O(1)
    private static boolean checkKthBit2(int n, int k) {
        int x = (1 << k-1);
        return (n & x) != 0;
    }

    // TC : O(1)
    // SC : O(1)
    private static boolean checkKthBit3(int n, int k) {
        return (n & 1 << k-1) != 0;
    }
}
