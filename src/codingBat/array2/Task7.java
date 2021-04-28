package codingBat.array2;

/*
    7. Для массива целых чисел верните истину, если в массиве нет ни 1, ни 3.
 */
public class Task7 {
    public boolean lucky13(int[] array) {
        for (int num : array) {

            if (num == 1 || num == 3) {
                return false;
            }
        }
        return true;
    }
}
