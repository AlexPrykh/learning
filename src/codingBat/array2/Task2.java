package codingBat.array2;

/*
    2. При длине массива 1 или более целых чисел, вернуть разницу между
       наибольшим и наименьшим значениями в массиве.
       Примечание:
       встроенные методы Math.min (v1, v2) и Math.max (v1, v2)
       возвращают меньшее или большее из двух значений.
 */
public class Task2 {
    public int bigDiff(int[] array) {
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }
        }
        return (max - min);
    }
}
