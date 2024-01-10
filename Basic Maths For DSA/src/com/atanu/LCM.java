package com.atanu;

/**
 * @author Atanu
 */
public class LCM {

    public static void main(String[] args) {
        int a = 12, b = 15;
        System.out.println(lcm1(a, b));
        System.out.println(lcm2(a, b));
    }

    // TC : O(a*b-max(a,b))
    // SC : O(1)
    private static int lcm1(int a, int b) {
        int max = Math.max(a, b);
        while (true) {
            if (max % a == 0 && max % b == 0)
                break;
            max++;
        }
        return max;
    }

    // TC : O(log(min(a,b)))
    // SC : O(1)
    private static int lcm2(int a, int b) {
        return (a*b)/gcf(a,b);
    }

    // TC : O(log(min(a,b)))
    // SC : O(1)
    private static int gcf(int a, int b) {
        if (b == 0) return a;
        return gcf(b, a%b);
    }
}
