package com.atanu;

/**
 * @author Atanu
 */
public class Factorial {

    public static void main(String[] args) {
        int n = 3;
        System.out.println(fact1(n));
        System.out.println(fact2(n, 1));
    }

    // TC : O(n)
    // SC : O(n)
    private static int fact1(int n) {
        if (n==0 || n==1) return 1;
        return n*fact1(n-1);
    }

    // TC : O(n)
    // SC : O(1)
    private static int fact2(int n, int a) {
        if (n==0 || n==1) return a;
        return fact2(n-1, n*a);
    }
}
