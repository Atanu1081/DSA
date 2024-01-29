package com.atanu;

public class PowerSet {

    public static void main(String[] args) {
        String str = "abc";

        powerSet(str);
    }

    private static void powerSet(String str) {
        int n = str.length();
        int pSize = 1 << n;
        for (int i = 0; i < pSize; i++) {
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0)
                    System.out.print(str.charAt(j) + " ");
            }
            System.out.println();
        }
    }
}
