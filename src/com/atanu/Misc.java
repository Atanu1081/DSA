package com.atanu;

public class Misc {
    public static void main(String[] args) {
        int n = 5;

        System.out.println(get(n, 2));
        System.out.println(set(n, 2));
        System.out.println(clear(n, 2));
        System.out.println(isOdd(n));
        System.out.println(isEven(n));
    }

    private static int get(int n, int k) {
        int x = (1 << k-1);
        return n & x;
    }

    private static int set(int n, int k) {
        int x = (1 << k-1);
        return n | x;
    }

    private static int clear(int n, int k) {
        int x = (1 << k-1);
        return n & ~x;
    }

    private static boolean isOdd(int n) {
        return (n & 1) != 0;
    }

    private static boolean isEven(int n) {
        return (n & 1) == 0;
    }
}
