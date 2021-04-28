package week2;

import array.ArrayUtils;

/*
    9. Створити 2 масиви з випадковими числами від 25 до 75.
       Визначити, в якого з них більше парних елементів.
 */
public class Task9 {
    public static int countEvenElements(int[] array) {
        int count = 0;
        for (int value : array) {
            if (value % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] array1 = ArrayUtils.generateArrayInRange(5, 25, 75);
        ArrayUtils.printArray(array1);

        int[] array2 = ArrayUtils.generateArrayInRange(5, 25, 75);
        ArrayUtils.printArray(array2);

        int countArray1 = countEvenElements(array1);
        int countArray2 = countEvenElements(array2);

        if (countArray1 > countArray2) {
            System.out.println("More in the first: " + countArray1);
        } else if (countArray1 < countArray2) {
            System.out.println("More in the second: " + countArray2);
        } else {
            System.out.println("Paired array elements are the same.");
        }
    }
}

