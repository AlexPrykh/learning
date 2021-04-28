package array;

public class MatrixUtils {
    //Создание двумерного массива и заполнение его рандомными числами.
    public static int[][] generateMatrixInRange(int rows, int columns, int from, int to) {
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = (int) (Math.random() * from + (to - from));
            }
        }
        return matrix;
    }

    //Вывод матрицы в консоль для (int).
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Вывод матрицы с истинным значением в консоль.
    public static void printMatrixBoolean(boolean[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
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
                System.out.print(matrix[i][j] + " ");
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
        return newMatrix ;
    }
}