package com.atanu;

public class Rotation {

    public static void main(String[] args) {
        int[ ][ ] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int[ ][ ] matrix1 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

        PrintMatrix.normalPrint(matrix);

        rotation1(matrix);
        rotation2(matrix1);
    }

    // TC : O(m*n)
    // SC : O(m*n)
    private static void rotation1(int[][] matrix) {
        int[][] temp = new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                temp[i][j] = matrix[j][matrix.length-i-1];
            }
        }
        PrintMatrix.normalPrint(temp);
    }

    // TC : O(m*n)
    // SC : O(1)
    private static void rotation2(int[][] matrix) {
        // transpose
        Transpose.transpose2(matrix);

        // reverse the column order
        for (int i = 0; i < matrix[0].length; i++) {
            int low = 0;
            int high = matrix.length-1;
            while (low < high) {
               swap(matrix, i, low, high);
               low++;
               high--;
            }
        }
        PrintMatrix.normalPrint(matrix);
    }

    private static void swap(int[][] matrix, int i, int j) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }

    private static void swap(int[][] matrix, int c, int low, int high) {
        int temp = matrix[low][c];
        matrix[low][c] = matrix[high][c];
        matrix[high][c] = temp;
    }


}
