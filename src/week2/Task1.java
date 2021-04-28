package week2;
/*
    1. Знайти мінімальне і максимальне значення в масиві, вивести їх в консоль.
 */

import array.ArrayUtils;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter the size of the array:");
        int sizeArray = sc.nextInt();

        int[] array = ArrayUtils.generateArrayInRange(sizeArray, 0, 100);
        ArrayUtils.printArray(array);
        System.out.println();

        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        for (int number : array) {
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Max value: " + max +
                "\nMin value: " + min);
    }
}