package week3;

import java.util.Arrays;

/*
    6.  Знайти найбільшу безперервну послідовністьн нулів та одиниць в послідовності цифр.
	    Вхід: 10001101001
	    Вихід:
		(2, 4) - нулі
		(5, 6) - одиниці
 */
public class Task6 {
    public static void main(String[] args) {
        int[] array = {1, 0, 0, 0, 1, 1, 0, 1, 0, 0, 1};
        System.out.println("Entrance:");
        System.out.println(Arrays.toString(array));
        System.out.println();

        System.out.println("Exit:");

        int zeroStartIndex = 0;
        int zeroEndIndex = 0;
        int maxZeroLength = 0;

        int unitStartIndex = 0;
        int unitEndIndex = 0;
        int maxUnitLength = 0;

        for (int i = 0; i < array.length; i++) {
            int current = array[i];
            for (int j = i + 1; j < array.length; j++) {
                int next = array[j];

                if (current != next) {
                    int length = j - i;
                    if (current == 0 && maxZeroLength < length) {
                        maxZeroLength = length;
                        zeroStartIndex = i;
                        zeroEndIndex = j;
                    } else if (current == 1 && maxUnitLength < length) {
                        maxUnitLength = length;
                        unitStartIndex = i;
                        unitEndIndex = j;
                    }
                    i = j - 1;
                    break;
                }
            }
        }
        System.out.println("Zero: " + (zeroStartIndex + 1) + ", " + zeroEndIndex);
        System.out.println("Unit: " + (unitStartIndex + 1) + ", " + unitEndIndex);
    }
}