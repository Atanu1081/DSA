package com.atanu;

/**
 * @author Atanu
 */
public class SumofFirstNaturalNumber {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(test1(n));
        System.out.println(test2(n));
        System.out.println(test3(n));
    }

    // TC : O(1)
    // SC : O(1)
    private static int test1(int n) {
        return n*(n+1)/2;
    }

    // TC : O(n)
    // SC : O(1)
    private static int test2(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    // TC : O(n)
    // SC : O(n)
    private static int test3(int n) {
        if (n == 0) return 0;
        return n + test3(n-1);
    }
}
