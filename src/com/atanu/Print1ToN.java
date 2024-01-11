package com.atanu;

/**
 * @author Atanu
 */
public class Print1ToN {
    public static void main(String[] args) {
        int n = 4;
        test1(n);
        test2(n);
        test3(n, 1);
    }

    // TC : O(n)
    // SC : O(1)
    private static void test1(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    // TC : O(n)
    // SC : O(n)
    private static void test2(int n) {
        if (n==0) return;
        test2(n-1);
        System.out.println(n);
    }

    // TC : O(n)
    // SC : O(1)
    private static void test3(int n, int k) {
        if (n==0) return;
        System.out.println(k);
        test3(n-1, k + 1);
    }
}
