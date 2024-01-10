package com.atanu;

/**
 * @author Atanu
 */
public class HCF {

    public static void main(String[] args) {
        int a = 12, b = 15;
        System.out.println(hcf1(a, b));
        System.out.println(hcf2(a, b));
        System.out.println(hcf3(a, b));
    }

    // TC : O(min(a,b))
    // SC : O(1)
    private static int hcf1(int a, int b) {
        int min = Math.min(a, b);
        while (min != 0) {
            if (a % min == 0 && b % min == 0)
                break;
            min--;
        }
        return min;
    }

    // TC : O(max(a,b))
    // SC : O(1)
    private static int hcf2(int a, int b) {
        while (a != b) {
            if (a > b)
                a = a-b;
            else
                b = b-a;
        }
        return a;
    }

    // TC : O(log(min(a,b)))
    // SC : O(1)
    private static int hcf3(int a, int b) {
        if (b == 0) return a;
        return hcf3(b, a%b);
    }
}
