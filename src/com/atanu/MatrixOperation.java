package com.atanu;

public class MatrixOperation {

    public static void main(String[] args) {
        int[ ][ ] matrix1 = {{1, 2}, {3, 4}};
        int[ ][ ] matrix2 = {{5, 6}, {7, 8}};

        PrintMatrix.normalPrint(matrix1);
        System.out.println("*************");
        PrintMatrix.normalPrint(matrix2);
        System.out.println("*************");
        int[ ][ ] matrix3 = add(matrix1, matrix2);
        PrintMatrix.normalPrint(matrix3);
        System.out.println("*************");
        int[ ][ ] matrix4 = sub(matrix1, matrix2);
        PrintMatrix.normalPrint(matrix4);
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
}
