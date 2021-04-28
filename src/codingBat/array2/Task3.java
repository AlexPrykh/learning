package codingBat.array2;

/*
    3. Возвращает "центрированное" среднее значение массива целых чисел,
       которое мы скажем как среднее значение значений, за исключением
       игнорирования наибольшего и наименьшего значений в массиве.
       Если имеется несколько копий наименьшего значения, игнорируйте только одну копию,
       а также самое большое значение. Используйте деление int,
       чтобы получить окончательное среднее значение.
       Вы можете предположить, что массив имеет длину 3 или более.
 */
public class Task3 {
    public int centeredAverage(int[] array) {
        int max = array[0];
        int min = array[0];
        int sum = array[0];

        for (int i = 1; i < array.length; i++) {
            sum += array[i];

            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }
        }
        return (sum - max - min) / (array.length - 2);
    }
}
