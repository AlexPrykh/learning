package codingBat.array1;

/*
    5. Для массива длиной 3 целых числа вернуть сумму всех элементов.
 */
public class Task5 {
    public int sum3(int[] number) {
        int sum = 0;
        for (int num : number) {
            sum += num;
        }
        return sum;
    }
}
