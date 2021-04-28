package codingBat.array2;

/*
    1. Вернуть количество четных целых чисел в данном массиве.
       Примечание: оператор % "mod" вычисляет остаток, например, 5 % 2 равно 1.
 */
public class Task1 {
    public int countEvens(int[] array) {
        int count = 0;

        for (int nums : array) {
            if (nums % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
