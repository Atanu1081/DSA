package com.atanu;

/**
 * @author Atanu
 */
public class TrappingWater {

    public static void main(String[] args) {

        int[] arr = {3, 0, 1, 2, 6};

        System.out.println(trappingWater1(arr));
        System.out.println(trappingWater2(arr));
    }

    // TC : O(n2)
    // SC : O(1)
    private static int trappingWater1(int[] arr) {
        int sum = 0;
        for (int i = 1; i < arr.length-1; i++) {
            int lmax = 0, rmax = 0;
            for (int j = 0; j < i; j++) {
                if (arr[j] > lmax)
                    lmax = arr[j];
            }
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] > rmax)
                    rmax = arr[j];
            }
            sum += Math.min(lmax, rmax) - arr[i];
        }
        return sum;
    }


    // TC : O(n)
    // SC : O(n)
    private static int trappingWater2(int[] arr) {
        int[] lmax = new int[arr.length];
        int[] rmax = new int[arr.length];
        lmax[0] = arr[0];
        rmax[arr.length-1] = arr[arr.length-1];
        int sum = 0;
        for (int i = 1; i < arr.length; i++) {
            lmax[i] = Math.max(arr[i], lmax[i-1]);
        }
        for (int i = arr.length-2; i >= 0; i--) {
            rmax[i] = Math.max(arr[i], rmax[i+1]);
        }
        for (int j = 1; j < arr.length-1; j++) {
            sum += Math.min(lmax[j], rmax[j]) - arr[j];
        }
        return sum;
    }

}
