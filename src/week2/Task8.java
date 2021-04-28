package week2;

import array.ArrayUtils;

/*
    8. Дано два масиви однакової довжини arr1 i arr2.
       Вивести в консоль значення масиву, який отримаємо в результаті arr1[i] + arr2[i]
 */
public class Task8 {
    public static void main(String[] args) {
        int[] array1 = ArrayUtils.generateArrayInRange(5, 0, 100);
        ArrayUtils.printArray(array1);

        int[] array2 = ArrayUtils.generateArrayInRange(5, 0, 100);
        ArrayUtils.printArray(array2);

        int[] array3 = new int[5];

        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i] + array2[i];
        }
        ArrayUtils.printArray(array3);
    }
}
