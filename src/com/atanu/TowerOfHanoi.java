package com.atanu;

/**
 * @author Atanu
 */
public class TowerOfHanoi {

    public static void main(String[] args) {
        toh(3, 1, 2, 3);
    }

    private static void toh(int n, int a, int b, int c) {
        if (n > 0) {
            toh(n-1, a, c, b);
            System.out.println("Move a disc from " + a + " to " + c);
            toh(n-1, b, a, c);
        }
    }
}
