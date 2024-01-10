package com.atanu;

/**
 * @author Atanu
 */
public class Armstrong {

    public static void main(String[] args) {
        int n = 152;
        System.out.println(armstrong(n));
    }

    // TC : O(d), where d is the number of digits in n
    // SC : O(1)
    private static boolean armstrong(int n) {
        int count = count(n);
        int temp = n;
        int rev = 0, sum = 0;
        while (n != 0) {
            rev = n%10;
            sum = sum + (int) Math.pow(rev, count);
            n = n/10;
        }
        return temp == sum;
    }

    private static int count(int n) {
        int count = 0;
        int temp = n;
        while (temp != 0) {
            temp = temp/10;
            count++;
        }
        return count;
    }
}
