package com.atanu;

/**
 * @author Atanu
 */
public class FibonacciNumber {

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fibonacci1(n));
        System.out.println(fibonacci2(n));
        System.out.println(fibonacci3(n));
    }

    // TC : O(n)
    // SC : O(n)
    private static int fibonacci1(int n) {
        if (n == 0 || n == 1) return n;
        return fibonacci1(n-1) + fibonacci1(n-2);
    }

    // TC : O(n)
    // SC : O(n)
    private static int fibonacci2(int n) {
        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n];
    }

    // TC : O(n)
    // SC : O(1)
    private static int fibonacci3(int n) {
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}
