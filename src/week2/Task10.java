package week2;

import array.ArrayUtils;

/*
    10. Інвертувати масив (розвернути) без використання додаткового масиву.
 */
public class Task10 {
    public static void main(String[] args) {
        int[] array = ArrayUtils.generateArrayInRange(10, 0, 100);
        ArrayUtils.printArray(array);

        ArrayUtils.reverse(array);
    }
}
