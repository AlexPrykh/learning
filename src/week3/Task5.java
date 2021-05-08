package week3;

import array.MatrixUtils;

/*
    5. а) Поміняти найбільшу та найменшу стрічку(масив) місцями
        в двовимірному масиві (розмір - сума елементів в масиві):
       б) Поміняти найбільший та найменший стовпчик в двовимірному масиві.
 */
public class Task5 {
    public static void main(String[] args) {
        int[][] matrix = MatrixUtils.generateMatrixInRange(5, 5, 0, 100);
        System.out.println("A:");
        MatrixUtils.printMatrix(matrix);
        System.out.println();

        int maxSum = Integer.MIN_VALUE;
        int maxSumIndex = 0;
        int minSum = Integer.MAX_VALUE;
        int minSumIndex = 0;

        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxSumIndex = i;
            }
            if (sum < minSum) {
                minSum = sum;
                minSumIndex = i;
            }
        }

        int[] maxRow = matrix[maxSumIndex];
        matrix[maxSumIndex] = matrix[minSumIndex];
        matrix[minSumIndex] = maxRow;
        System.out.println("Matrix after row replacement:");
        MatrixUtils.printMatrix(matrix);
        System.out.println();

        System.out.println("B:");
        MatrixUtils.printMatrix(matrix);
        System.out.println();

        int maxSum2 = Integer.MIN_VALUE;
        int maxSumIndex2 = 0;
        int minSum2 = Integer.MAX_VALUE;
        int minSumIndex2 = 0;

        for (int i = 0; i < matrix[0].length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix.length; j++) {
                sum += matrix[j][i];
            }
            if (sum > maxSum2) {
                maxSum2 = sum;
                maxSumIndex2 = i;
            }
            if (sum < minSumIndex2) {
                minSum2 = sum;
                minSumIndex2 = i;
            }
        }

        int[] maxColumn = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            maxColumn[i] = matrix[i][maxSumIndex2];
        }
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][maxSumIndex2] = matrix[i][minSumIndex2];
        }
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][minSumIndex2] = maxColumn[i];
        }
        MatrixUtils.printMatrix(matrix);
    }
}
