package com.atanu;

public class MatrixOperation {

    public static void main(String[] args) {
        int[ ][ ] matrix1 = {{1, 2}, {3, 4}};
        int[ ][ ] matrix2 = {{5, 6}, {7, 8}};

        PrintMatrix.normalPrint(matrix1);
        PrintMatrix.normalPrint(matrix2);
        PrintMatrix.normalPrint(add(matrix1, matrix2));
        PrintMatrix.normalPrint(sub(matrix1, matrix2));
        PrintMatrix.normalPrint(mul(matrix1, matrix2));
    }

    // TC : O(m*n)
    // SC : O(1)
    private static int[][] add(int[][] matrix1, int[][] matrix2) {
        int[ ][ ] matrix3 = new int[matrix1.length][matrix1.length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return matrix3;
    }

    // TC : O(m*n)
    // SC : O(1)
    private static int[][] sub(int[][] matrix1, int[][] matrix2) {
        int[ ][ ] matrix3 = new int[matrix1.length][matrix1.length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix3[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return matrix3;
    }

    private static int[][] mul(int[][] matrix1, int[][] matrix2) {
        int[ ][ ] matrix3 = new int[matrix1.length][matrix1[0].length];
        int sum = 0;
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                for (int k = 0; k < matrix2.length; k++) {
                    sum = sum + matrix1[i][k] * matrix2[k][j];
                }
                matrix3[i][j] = sum;
                sum = 0;
            }
        }
        return matrix3;
    }
}
