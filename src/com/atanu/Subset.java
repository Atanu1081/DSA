package com.atanu;

/**
 * @author Atanu
 */
public class Subset {
    public static void main(String[] args) {
        String s = "a";
        subset(s, "", 0);
    }

    private static void subset(String s, String s1, int i) {
        if (i == s.length()) {
            System.out.print(s1 +" ");
            return;
        }
        subset(s, s1, i+1);
        subset(s, s1+s.charAt(i), i+1);
    }


}
