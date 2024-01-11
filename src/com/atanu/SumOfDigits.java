package com.atanu;

/**
 * @author Atanu
 */
public class SumOfDigits {

    public static void main(String[] args) {
        int n = 123;
        System.out.println(sum1(n));
        System.out.println(sum2(n));
    }

    // TC : O(d)
    // SC : O(1)
    private static int sum1(int n) {
        int sum = 0;
        int rev = 0;
        while (n != 0) {
            rev = n % 10;
            sum += rev;
            n = n / 10;
        }
        return sum;
    }

    // TC : O(d)
    // SC : O(d)
    private static int sum2(int n) {
        if (n == 0)
            return 0;
        return sum2(n/10) + n % 10;
    }
}
