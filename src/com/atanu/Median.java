package com.atanu;

import java.util.Arrays;

public class Median {

    public static void main(String[] args) {
        int[ ][ ] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

        System.out.println(median1(matrix));
        System.out.println(median2(matrix));
    }

    // TC : O(m*n*log(m*n))
    // SC : O(1)
    private static String median1(int[][] matrix) {
        int[] temp = new int[matrix.length * matrix[0].length];
        int index = 0;
        for (int[] arr : matrix) {
            for (int ele : arr) {
                temp[index] = ele;
                index++;
            }
        }
        Arrays.sort(temp);
        int length = temp.length;
        if (length % 2 != 0)
            return temp[length/2] + " ";
        else {
            int mid1 = temp[length/2];
            int mid2 = temp[length/2+1];
            return (mid1+mid2)/2 + " ";
        }
    }

    // TC : O(m*log(max-min)*log(n))
    // SC : O(1)
    private static int median2(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int min = matrix[0][0];
        int max = matrix[0][c-1];
        for (int i = 0; i < r; i++) {
            if (matrix[i][0] < min)
                min = matrix[i][0];
            if (matrix[i][c-1] > max)
                max = matrix[i][c-1];
        }
        int medPos = (r*c+1)/2;
        while (min < max) {
            int mid = (max+min)/2;
            int midPos = 0;
            for (int i = 0; i < r; i++) {
                int pos = Arrays.binarySearch(matrix[i], mid) + 1;
                midPos += Math.abs(pos);
            }
            if (medPos > midPos)
                min = mid+1;
            else
                max = mid;
        }
        return min;
    }
}
