package com.atanu;

public class SquareRoot {

    public static void main(String[] args) {
        int n = 19;

        System.out.println(squareRoot1(n));
        System.out.println(squareRoot2(n));
    }

    // TC: O(squarerootn)
    // SC: O(1)
    private static int squareRoot1(int n) {
        int i = 1;
        while (i*i <= n)
            i++;
        return i-1;
    }

    // TC: O(logn)
    // SC: O(1)
    private static int squareRoot2(int n) {
        int low = 1;
        int high = n;
        int ans = -1;

        while (low <= high) {
            int mid = (low+high)/2;
            int mSquare = mid*mid;
            if (n == mSquare)
                return mid;
            if (n < mSquare)
                high = mid-1;
            else {
                low = mid+1;
                ans = mid;
            }
        }
        return ans;
    }
}
