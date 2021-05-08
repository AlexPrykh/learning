package week3;

import array.MatrixUtils;

/*
    2. Створити логічну матрицю з наступними критеріями:
       якщо i дорівнює j, то елементом має бути true.
 */
public class Task2 {
    public static void main(String[] args) {
        boolean[][] matrix = new boolean[5][5];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i] == matrix[j]) {
                    matrix[i][j] = true;
                }
            }
        }
        MatrixUtils.printMatrixBoolean(matrix);
    }
}
