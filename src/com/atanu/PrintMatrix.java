package com.atanu;

/**
 * @author Atanu
 */
public class PrintMatrix {
    public static void main(String[] args) {
        int[ ][ ] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        normalPrint(matrix);
        System.out.println("*************************");
        snakeTraversal(matrix, 3, 3);
        System.out.println("*************************");
        boundaryTraversal(matrix, 3, 3);
        System.out.println("*************************");
        spiralTraversal(matrix, 3, 3);
    }

    // TC : O(m*n)
    // SC : O(1)
    public static void normalPrint(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // TC : O(m*n)
    // SC : O(1)
    private static void snakeTraversal(int[][] matrix, int r, int c) {
        for (int i = 0; i < r; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < c; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            else {
                for (int j = c-1; j >= 0; j--) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    // TC : O(m+n)
    // SC : O(1)
    private static void boundaryTraversal(int[][] matrix, int r, int c) {
        if (r == 1) {
            for (int i = 0; i < c; i++)
                System.out.print(matrix[0][i] + " ");
        }
        if (c == 1) {
            for (int i = 0; i < r; i++)
                System.out.print(matrix[i][0] + " ");
        }
        else {
            for (int i = 0; i < c; i++)
                System.out.print(matrix[0][i] + " ");
            for (int i = 1; i < r; i++)
                System.out.print(matrix[i][c-1] + " ");
            for (int i = c-2; i >= 0; i--)
                System.out.print(matrix[r-1][i] + " ");
            for (int i = r-2; i >= 1; i--)
                System.out.print(matrix[i][0] + " ");
        }
        System.out.println();
    }

    // TC : O(m*n)
    // SC : O(1)
    private static void spiralTraversal(int[][] matrix, int r, int c) {
        int top = 0;
        int right = c-1;
        int left = 0;
        int bottom = r-1;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++)
                System.out.print(matrix[top][i] + " ");
            top++;
            for (int i = top; i <= bottom; i++)
                System.out.print(matrix[i][right] + " ");
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    System.out.print(matrix[bottom][i] + " ");
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    System.out.print(matrix[i][left] + " ");
                left++;
            }
        }
    }
}
