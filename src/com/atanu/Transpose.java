package com.atanu;

import java.util.ArrayList;
import java.util.List;

public class Transpose {

    public static void main(String[] args) {
        int[ ][ ] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

        PrintMatrix.normalPrint(matrix);

        transpose1(matrix);

        transpose2(matrix);
    }

    // TC : O(m*n)
    // SC : O(m*n)
    private static void transpose1(int[][] matrix) {
        int[][] temp = new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                temp[i][j] = matrix[j][i];
            }
        }
        PrintMatrix.normalPrint(temp);
    }

    // TC : O(m*n)
    // SC : O(1)
    public static void transpose2(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i+1; j < matrix.length; j++) {
                swap(matrix, i, j);
            }
        }
        PrintMatrix.normalPrint(matrix);
    }

    private static void swap(int[][] matrix, int i, int j) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }


}
