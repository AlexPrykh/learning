package codingBat.array2;

/*
    4. Возвращает сумму чисел в массиве, возвращая 0 для пустого массива.
       За исключением того, что число 13 очень неудачное,
       поэтому оно не учитывается, и числа, следующие сразу после числа 13, также не учитываются.
 */
public class Task4 {
    public int sum13(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] != 13) {
                sum += array[i];

                if (i > 0 && array[i - 1] == 13) {
                    sum -= array[i];
                }
            }
        }
        return sum;
    }
}
