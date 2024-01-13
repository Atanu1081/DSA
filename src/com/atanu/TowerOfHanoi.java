package com.atanu;

/**
 * @author Atanu
 */
public class TowerOfHanoi {

    public static void main(String[] args) {
        int n = 2;
        System.out.println(toh(n, 1, 2, 3)+1);
    }

    // TC : O(2powerofn)
    // SC : O(n)
    private static int toh(int n, int a, int b, int c) {
        if (n > 0) {
            toh(n-1, a, c, b);
            System.out.println("Move a disc from " + a + " to " + c);
            toh(n-1, b, a, c);
        }
        return n;
    }
}
