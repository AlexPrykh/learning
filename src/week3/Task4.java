package week3;

import array.MatrixUtils;

import java.util.Arrays;

/*
    4. Створити масив, який буде представляти собою діагональ матриці.
		1 3 5
		4 5 7  -  1 5 6
		4 5 6
 */
public class Task4 {
    public static void main(String[] args) {
        int[][] matrix = MatrixUtils.generateMatrixInRange(3, 3, 0, 50);
        MatrixUtils.printMatrix(matrix);
        System.out.println();

        int[] array = new int[3];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    array[i] = matrix[i][j];
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
