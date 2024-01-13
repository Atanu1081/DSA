package com.atanu;

/**
 * @author Atanu
 */
public class Josephus {

    public static void main(String[] args) {
        System.out.println(jp(8, 2));
    }

    // TC : O(n)
    // SC : O(n)
    private static int jp(int n, int k) {
        if (n==1)
            return 0;
        return ((jp(n-1, k)+k)%n);
    }
}
