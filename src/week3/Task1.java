package week3;

import array.MatrixUtils;

/*
    1. Замінити всі числа, що діляться на 5 без остачі в двовимірній матриці на 8.
 */
public class Task1 {
    public static void main(String[] args) {
        int[][] matrix = MatrixUtils.generateMatrixInRange(8, 8, 0, 100);
        MatrixUtils.printMatrix(matrix);

        System.out.println("=== === === === === ===");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                int number = matrix[i][j];
                if (number % 5 == 0) {
                    matrix[i][j] = 8;
                }
            }
        }
        MatrixUtils.printMatrix(matrix);
    }
}
