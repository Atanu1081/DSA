package com.atanu;

/**
 * @author Atanu
 */
public class PalindromeNumbers {

    public static void main(String[] args) {
        int n = 84569;
        System.out.println(palindrome(n));
    }

    // TC : O(d), where d is the number of digits in n
    // SC : O(1)
    private static boolean palindrome(int n) {
        int rev = 0, temp = n;
        while (n != 0) {
            rev = rev*10 + n%10;
            n = n/10;
        }
        return (temp == rev);
    }
}
