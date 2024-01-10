package com.atanu;

public class Prime {

    public static void main(String[] args) {
        int n = 13;
        System.out.println(prime1(n));
        System.out.println(prime2(n));
        System.out.println(prime3(n));
    }

    // TC : O(n)
    // SC : O(1)
    private static boolean prime1(int n) {
        if (n == 1) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    // TC : O(rootn)
    // SC : O(1)
    private static boolean prime2(int n) {
        if (n == 1) return false;
        for (int i = 2; i*i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    // TC : Lot less
    // SC : O(1)
    private static boolean prime3(int n) {
        if (n == 1) return false;
        if (n == 2 || n == 3) return true;
        if (n%2 == 0 || n%3==0) return false;
        for (int i = 5; i*i < n; i=i+6) {
            if (n % i == 0 || n % (i+2) == 0)
                return false;
        }
        return true;
    }
}
