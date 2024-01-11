package com.atanu;

/**
 * @author Atanu
 */
public class PrintNTo1 {
    public static void main(String[] args) {
        int n = 5;
        test1(n);
        test2(n);
    }

    // TC : O(n)
    // SC : O(1)
    private static void test1(int n) {
        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
    }

    // TC : O(n)
    // SC : O(n)
    private static void test2(int n) {
        if (n==0) return;
        System.out.println(n);
        test2(n-1);
    }
}
