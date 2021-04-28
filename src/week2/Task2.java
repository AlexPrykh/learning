package week2;

import array.ArrayUtils;

import java.util.Scanner;

/*
    2. Поміняти місцями найбільший і найменший елемент в масиві.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter the size of the array: ");
        int sizeArray = sc.nextInt();

        int min = 0;
        int max = 0;
        int temp;

        int[] array = ArrayUtils.generateArrayInRange(sizeArray, 0, 100);
        ArrayUtils.printArray(array);

        for (int i = 0; i < sizeArray; i++) {

            if (array[min] > array[i]) {
                min = i;
            }
            if (array[max] < array[i]) {
                max = i;
            }
        }
        System.out.println("Min: " + "array[" + min + "] = " + array[min]);
        System.out.println("Max: " + " array[" + max + "] = " + array[max]);

        temp = array[min];
        array[min] = array[max];
        array[max] = temp;

        ArrayUtils.printArray(array);
    }
}
