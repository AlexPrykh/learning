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
        System.out.println(findMaxSequence(array, 0));
        System.out.println(findMaxSequence(array, 1));

    }

    private static String findMaxSequence(int[] array, int element) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == element) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] != element) {
                        i = j;
                        break;
                    } else {
                        start = i;
                        end = j;
                    }
                }
            }

        }
        return String.format("%d - (%d, %d)", element, start + 1, end + 1);
    }
}