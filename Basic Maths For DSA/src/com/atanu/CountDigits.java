package com.atanu;

public class CountDigits {

    public static void main(String[] args) {
        int n = 879;
        System.out.println(count(n));
    }

    // TC : O(d), where d is the number of digits in n
    // SC : O(1)
    private static int count(int n) {
        int count = 0;
        while (n != 0) {
            n = n/10;
            count++;
        }
        return count;
    }
}
