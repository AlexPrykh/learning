package codingBat.array2;

/*
    8. Для массива целых чисел верните истину, если сумма всех двоек в массиве равна 8.
 */
public class Task8 {
    public boolean sum28(int[] array) {
        int sum = 0;

        for (int num : array) {

            if (num == 2) {
                sum += 2;
            }
        }
        return (sum == 8);
    }
}
