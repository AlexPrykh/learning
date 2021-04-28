package week2;

import array.ArrayUtils;

import java.util.Arrays;

/*
    7. Вивести в консоль елементі тієї половини масиву,
       у якої середнє арифметичне максимальне.
 */
public class Task7 {
    public static void main(String[] args) {
        int[] array = ArrayUtils.generateArrayInRange(10, 0, 100);
        ArrayUtils.printArray(array);
        System.out.println();

        double sum1 = 0;
        double sum2 = 0;
        int arrayHalfLength = array.length / 2;

        for (int i = 0; i < arrayHalfLength; i++) {
            sum1 += array[i];
        }
        for (int i = arrayHalfLength; i < array.length; i++) {
            sum2 += array[i];
        }

        double average1 = sum1 / arrayHalfLength;
        double average2 = sum2 / (array.length - arrayHalfLength);
        System.out.println(Arrays.toString(array));
        System.out.println();

        if (average1 > average2) {
            for (int i = 0; i < arrayHalfLength; i++) {
                System.out.println(array[i] + " ");
            }
        } else if (average1 < average2) {
            for (int i = arrayHalfLength; i < array.length; i++) {
                System.out.println(array[i] + " ");
            }
        } else {
            System.out.println("Both averages are equal.");
        }
    }
}
