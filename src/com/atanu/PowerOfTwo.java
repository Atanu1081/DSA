package com.atanu;

/**
 * @author Atanu
 */
public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 4;

        System.out.println(power1(n));
        System.out.println(power2(n));
    }

    // TC : O(logn)
    // SC : O(1)
    private static boolean power1(int n) {
        if (n == 0)
            return false;
        while (n != 1) {
            if (n % 2 != 0)
                return false;
            n = n/2;
        }
        return true;
    }

    // TC : O(1)
    // SC : O(1)
    private static boolean power2(int n) {
        if (n == 0)
            return false;
        return (n & n-1) == 0;
    }
}
