package com.atanu;

/**
 * @author Atanu
 */
public class RopeCutting {

    public static void main(String[] args) {
        System.out.println(rc(5, 2, 5, 1));
    }

    // TC : O(3powerofn)
    // SC : O(n)
    private static int rc(int n, int a,int b, int c) {
        if (n == 0)
            return 0;
        if (n < 0)
            return -1;

        int res = Math.max(rc(n-a, a, b, c),
                Math.max(rc(n-b, a, b, c),
                        rc(n-c, a, b, c)));

        if(res == -1)
            return -1;

        return res + 1;

    }
}
