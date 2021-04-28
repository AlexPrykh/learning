package week2;

import array.ArrayUtils;

import java.util.Arrays;

/*
    3. Дано два масиви однакової довжини з будь-якими значеннями.
       Скопіювати дані з першого масиву в другий.
 */
public class Task3 {
    public static void main(String[] args) {
        int[] array1 = ArrayUtils.generateArrayInRange(10, 0, 100);
        ArrayUtils.printArray(array1);
        System.out.println();

        int[] array2 = new int[array1.length];

        System.out.println("Arrays after copying: ");

        System.out.println("Array 1:");
        System.out.println(Arrays.toString(array1));
        System.out.println();

        System.out.println("Copied array:");
        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }
        System.out.println(Arrays.toString(array2));
    }
}
