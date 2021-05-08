package week3;

import array.MatrixUtils;

import java.util.Objects;

/*
    9. Помножити 2 матриці.
 */
public class Task9 {
    public static void main(String[] args) {
        int[][] matrix1 = MatrixUtils.generateMatrixInRange(5, 5, 0, 100);
        int[][] matrix2 = MatrixUtils.generateMatrixInRange(5, 5, 0, 100);
        System.out.println("Matrix 1:");
        MatrixUtils.printMatrix(matrix1);
        System.out.println("=== === === === ===");
        System.out.println("Matrix 2:");
        MatrixUtils.printMatrix(matrix2);
        System.out.println();

        System.out.println("Matrix multiplications result:");
        MatrixUtils.printMatrix(Objects.requireNonNull(multiplyByMatrix(matrix1, matrix2)));

    }

    private static int[][] multiplyByMatrix(int[][] matrix1, int[][] matrix2) {
        int matrix1ColumnLength = matrix1[0].length;
        int matrix2RowLength = matrix2.length;
        if (matrix1ColumnLength != matrix2RowLength) {
            return null;
        }
        int matrixResultRowLength = matrix1.length;
        int matrixResultColumnLength = matrix2[0].length;
        int[][] matrixResult = new int[matrixResultRowLength][matrixResultColumnLength];
        for (int i = 0; i < matrixResultRowLength; i++) {
            for (int j = 0; j < matrixResultColumnLength; j++) {
                for (int k = 0; k < matrix1ColumnLength; k++) {
                    matrixResult[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return matrixResult;
    }
}
