package com.atanu;

public class Search {

    public static void main(String[] args) {
        int[ ][ ] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

        System.out.println(search1(matrix, 11));
        System.out.println(search2(matrix, 11));
    }

    // TC : O(m*n)
    // SC : O(1)
    private static String search1(int[][] matrix, int x) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (x == matrix[i][j])
                    return i + " " + j;
            }
        }
        return "-1";
    }

    // TC : O(m+n)
    // SC : O(1)
    private static String search2(int[][] matrix, int x) {
        int i = 0, j = matrix[0].length-1;
        while (i < matrix.length && j >= 0) {
            if (x == matrix[i][j])
                return i + " " + j;
            else if (x > matrix[i][j])
                i++;
            else
                j--;
        }
        return "-1";
    }
}
