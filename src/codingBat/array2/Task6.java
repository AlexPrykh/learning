package codingBat.array2;

/*
    6. Учитывая массив целых чисел, верните true,
       если массив содержит где-то 2 рядом с 2.
 */
public class Task6 {
    public boolean has22(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {

            if (array[i] == 2 && array[i + 1] == 2) {
                return true;
            }
        }
        return false;
    }
}
