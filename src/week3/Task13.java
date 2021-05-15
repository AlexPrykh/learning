package week3;

import array.MatrixUtils;

import java.util.Arrays;
import java.util.Scanner;

/*
    13. Написати гру "морський бій" на 1 корабель.
        Розмір поля вводить користувач. При промаху показувати підказку.
 */
public class Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimension of the playing field:");
        System.out.println("Number of lines:");
        int rows = sc.nextInt();
        System.out.println("Number of columns:");
        int columns = sc.nextInt();
        String[][] gameField = generateField(rows, columns);
        System.out.println();

        System.out.println("This is your battleground! Playing or die!");
        MatrixUtils.printMatrix(gameField);

        String[][] shipMatrix = generateField(rows, columns);
        generateShip(shipMatrix);

        boolean gameOver = false;
        while (!gameOver) {
            gameOver = shot(shipMatrix, gameField);
        }
        System.out.println("Congratulations! You have successfully completed the task!");
    }

    private static String[][] generateField(int rows, int colomns) {
        String[][] matrix = new String[rows][colomns];
        for (int i = 0; i < matrix.length; i++) {
            Arrays.fill(matrix[i], "~");
        }
        return matrix;
    }

    private static void generateShip(String[][] shipMatrix) {
        int length = shipMatrix.length;
        int shipLength = (int) (Math.random() * (length - 1) + 1);
        boolean isVertical = Math.random() > 0.5;
        int rowOrColumn = (int) (Math.random() * length);
        int indexStart = (int) (Math.random() * (length - shipLength + 1));
        if (isVertical) {
            for (int i = indexStart; i < indexStart + shipLength; i++) {
                shipMatrix[i][rowOrColumn] = "X";
            }
        } else {
            String[] row = shipMatrix[rowOrColumn];
            for (int i = indexStart; i < indexStart + shipLength; i++) {
                row[i] = "X";
            }
        }
    }

    private static boolean shot(String[][] shipMatrix, String[][] gameField) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which line do you want to hit?");
        int row = sc.nextInt();
        System.out.println("Which column do you want to hit?");
        int column = sc.nextInt();
        row--;
        column--;
        String shipMatrixValue = shipMatrix[row][column];
        if (shipMatrixValue.equals("X")) {
            System.out.println("You hit the ship!");
            shipMatrix[row][column] = "o";
            gameField[row][column] = "X";
        } else {
            System.out.println("You missed, aim more accurately!");
            gameField[row][column] = ".";
            hint(shipMatrix, row, column);
        }
        MatrixUtils.printMatrix(gameField);
        return checkWin(shipMatrix);
    }

    private static void hint(String[][] shipMatrix, int row, int column) {
        int findShipRow = -1;
        int findShipColumn = -1;
        for (int i = 0; i < shipMatrix[0].length; i++) {
            for (int j = 0; j < shipMatrix.length; j++) {
                if (shipMatrix[i][j].equals("X")) {
                    findShipRow = i;
                    findShipColumn = j;
                    break;
                }
            }
        }
        String hint = " ";
        if (row > findShipRow) {
            hint += "Try to hit up!";
        } else if (row < findShipRow) {
            hint += "Try to hit down!";
        }
        if (column > findShipColumn) {
            hint += "Try to hit left!";
        } else if (column < findShipColumn) {
            hint += "Try to hit right!";
        }
        System.out.println(hint);
    }

    private static boolean checkWin(String[][] shipMatrix) {
        for (int i = 0; i < shipMatrix.length; i++) {
            for (int j = 0; j < shipMatrix[i].length; j++) {
                if (shipMatrix[i][j].equals("X")) {
                    return false;
                }
            }
        }
        return true;
    }
}
