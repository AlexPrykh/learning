package week2;

import array.ArrayUtils;

/*
    6. Знайти середнє арифметичне масиву.
 */
public class Task6 {
    public static void main(String[] args) {
        int[] array = ArrayUtils.generateArrayInRange(10, 0, 10);
        ArrayUtils.printArray(array);
        System.out.println();

        double average = 0;

        for (int value : array) {
            average += value;
        }
        average /= array.length;

        System.out.println("Arithmetic mean of an array: " + average);
    }
}
