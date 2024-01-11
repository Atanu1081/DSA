package com.atanu;

/**
 * @author Atanu
 */
public class Palindrome {

    public static void main(String[] args) {
        String s = "malayalam";
        System.out.println(palindrome(s, 0, s.length()-1));
    }

    // TC : O(n)
    // SC : O(n)
    private static boolean palindrome(String s, int start, int end) {
        if (start >= end) {
            return true;
        }
        return ((s.charAt(start) == s.charAt(end)) && palindrome(s, start+1, end-1));
    }

}
