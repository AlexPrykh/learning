package codingBat.array2;

/*
    9. Учитывая массив целых чисел, верните истину,
       если количество единиц больше, чем количество четверок.
 */
public class Task9 {
    public boolean more14(int[] array) {
        int count1 = 0;
        int count4 = 0;

        for (int num : array) {

            if (num == 1) {
                count1++;
            }

            if (num == 4) {
                count4++;
            }
        }
        return (count1 > count4);
    }
}
