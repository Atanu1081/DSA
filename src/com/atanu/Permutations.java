package com.atanu;

/**
 * @author Atanu
 */
public class Permutations {
    public static void main(String[] args) {
        String s = "abcd";
        perm(s, 0);
    }

    private static void perm(String s, int i) {
        if (i == s.length()-1) {
            System.out.println(s);
            return;
        }
        for (int j = i; j < s.length(); j++) {
            s = swap(s, i, j);
            perm(s, i+1);
            s = swap(s, i, j);
        }
    }

    private static String swap(String s, int i, int j) {
        char[] arr = s.toCharArray();
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return String.valueOf(arr);
    }

}
