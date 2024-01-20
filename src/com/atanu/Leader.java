package com.atanu;

/**
 * @author Atanu
 */
public class Leader {

    public static void main(String[] args) {
        int[] arr = {12, 2, 10, 5, 6, 3};
        leader1(arr);
        System.out.println("********************************");
        leader2(arr);
    }


    // TC : O(n2)
    // SC : O(1)
    private static void leader1(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            boolean leader = true;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    leader = false;
                    break;
                }
            }
            if (leader)
                System.out.println(arr[i]);
        }
    }

    // TC : O(n)
    // SC : O(1)
    private static void leader2(int[] arr) {

        int cur_leader = arr[arr.length-1];
        System.out.println(cur_leader);
        for (int i = arr.length-2; i >= 0; i--) {
            if (arr[i] > cur_leader) {
                cur_leader = arr[i];
                System.out.println(cur_leader);
            }
        }
    }
}
