package week3;

import array.MatrixUtils;

/*
    11. Перевернути матрицю (двовимірний масив).
        Матриця квадратна. Користувач вводить кут кратний 90.
 */
public class Task11 {
    public static void main(String[] args) {
        System.out.println("Original matrix:");
        int[][] matrix = MatrixUtils.generateMatrixInRange(5, 5, 0, 100);
        MatrixUtils.printMatrix(matrix);
        System.out.println();

        System.out.println("Matrix rotated 90 degrees to the right:");
        MatrixUtils.printMatrix(turnToRight(matrix));
    }

    private static int[][] turnToRight(int[][] matrix) {
        int[][] resulMatrix = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                resulMatrix[j][matrix.length - i - 1] = matrix[i][j];
            }
        }
        return resulMatrix;
    }
}
