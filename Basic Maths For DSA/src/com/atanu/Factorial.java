package com.atanu;

public class Factorial {

    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial1(n));
        System.out.println(factorial2(n));
    }

    // TC : O(n)
    // SC : O(1)
    private static int factorial1(int n) {
        int res = 1;
        for (int i = 2; i <= n; i++) {
            res *= i;
        }
        return res;
    }

    // TC : O(n)
    // SC : O(n)
    private static int factorial2(int n) {
        if (n == 0) return 1;
        return n * factorial2(n-1);
    }
}
