package com.atanu;

/**
 * @author Atanu
 */
public class StockProblem {

    public static void main(String[] args) {

        int[] arr = {1, 5, 3, 8, 12};
        int[] arr1 = {7, 1, 5, 4, 3, 6};

        System.out.println(buySell1(arr1, 0, arr.length-1));
        System.out.println(buySell2(arr1));
    }

    // TC : O(n2)
    // SC : O(1)
    private static int buySell1(int[] arr, int start, int end) {
        if (start >= end) {
            return 0;
        }
        int profit = 0;
        for (int i = start; i < end; i++) {
            for (int j = i+1; j <= end; j++) {
                if (arr[j] > arr[i]) {
                    int current_profit = arr[j] - arr[i] + buySell1(arr, start, i-1)
                            + buySell1(arr, j+1, end);
                    profit = Math.max(profit, current_profit);
                }
            }
        }
        return profit;
    }

    // TC : O(n)
    // SC : O(1)
    private static int buySell2(int[] arr) {
        int profit = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i-1])
                profit += arr[i] - arr[i-1];
        }
        return profit;
    }
}
