package com.atanu;

public class MinPages {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};

        System.out.println(minPages1(arr, arr.length,2));
        System.out.println(minPages2(arr, arr.length,2));
    }

    private static int minPages1(int[] arr, int n, int k) {
        if (n == 1)
            return arr[0];
        if (k == 1)
            return sum(arr, 0, n-1);
        int res = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            res = Math.min(res, Math.max(minPages1(arr, i, k-1), sum(arr, i, n-1)));
        }
        return res;
    }

    private static int sum(int[] arr, int start, int end) {
        int sum = 0;
        for (int j = start; j <= end; j++) {
            sum += arr[j];
        }
        return sum;
    }

    private static int minPages2(int[] arr, int n, int k) {
        int sum = 0, max = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            max = Math.max(max, arr[i]);
        }
        int low = max, high = sum, res = 0;
        while (low <= high) {
            int mid = (low+high)/2;
            if (isFeasible(arr, n, k, mid)) {
                res = mid;
                high = mid-1;
            }
            else
                low = mid+1;
        }
        return res;
    }

    private static boolean isFeasible(int[] arr, int n, int k, int mid) {
        int req = 1, sum = 0;
        for (int i = 0; i < n; i++) {
            if (sum + arr[i] > mid) {
                req++;
                sum = arr[i];
            }
            else
                sum += arr[i];
        }
        return req <= k;
    }
}
