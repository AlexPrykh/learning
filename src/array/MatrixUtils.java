package array;

public class MatrixUtils {
    //Создание двумерного массива и заполнение его рандомными числами (int).
    public static int[][] generateMatrixInRange(int rows, int columns, int from, int to) {
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = from + (int) (Math.random() * (to - from));
            }
        }
        return matrix;
    }

    //Создание двумерного массива и заполнение его рандомными числами (double).
    public static double[][] generateMatrixInRangeToDouble(int rows, int columns, double from, double to) {
        double[][] matrix = new double[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = from + (Math.random() * (to - from));
            }
        }
        return matrix;
    }

    //Вывод матрицы в консоль для (int).
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    //Вывод матрицы в консоль для (double).
    public static void printMatrixToDouble(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    //Вывод матрицы с истинным значением в консоль.
    public static void printMatrixBoolean(boolean[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    //Проверяет является ли слово палиндромом.
    public static boolean isPalindrome(String word) {
        for (int i = 0; i < word.length() / 2; i++) {
            char leftChar = word.charAt(i);
            char rightChar = word.charAt(word.length() - 1 - i);
            if (leftChar != rightChar) {
                return false;
            }
        }
        return true;
    }

    //Вывод матрицы в консоль для (String).
    public static void printMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    //Метод который поворачивает матрицу на 90 градусов вправо.
    public static int[][] turnToRight(int[][] matrix) {
        int[][] newMatrix = new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                newMatrix[j][i] = matrix[i][j];
            }
        }
        return newMatrix;
    }

    //возвращает сумму елементов столбца матрицы
    public static int columnSum(int[][] matrix, int rows, int columnIndex) {
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            sum += matrix[i][columnIndex];
        }
        return sum;
    }

    //метод, который перемножает две матрицы (int).
    public static int[][] multiplyByMatrix(int[][] matrix1, int[][] matrix2) {
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

    //метод, который перемножает две матрицы (double).
    public static double[][] multiplyByMatrixToDouble(double[][] m1, double[][] m2) {
        int m1ColLength = m1[0].length; // m1 columns length
        int m2RowLength = m2.length;    // m2 rows length
        if (m1ColLength != m2RowLength) return null; // matrix multiplication is not possible
        int mRRowLength = m1.length;    // m result rows length
        int mRColLength = m2[0].length; // m result columns length
        double[][] mResult = new double[mRRowLength][mRColLength];
        for (int i = 0; i < mRRowLength; i++) {         // rows from m1
            for (int j = 0; j < mRColLength; j++) {     // columns from m2
                for (int k = 0; k < m1ColLength; k++) { // columns from m1
                    mResult[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return mResult;
    }
}