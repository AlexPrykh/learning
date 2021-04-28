package week2;

import array.ArrayUtils;

import java.util.Scanner;

/*
    13. Здвинути масив на задану кількість позицій. Наприклад:
	    {1,2,3,4,5} -> 2 = {4,5,1,2,3}; {1,2,3,4,5} -> 3 = {3,4,5,1,2}.
 */
public class Task13 {
    static int[] moves(int[] incoming, int delta) {
        int currentIndex, movedIndex, buffer;
        for (int i = 0; i < greatestCommonDivisor(delta, incoming.length); i++) {
            buffer = incoming[i];

            currentIndex = i;

            if (delta > 0) {
                while (true) {
                    movedIndex = currentIndex + delta;
                    if (movedIndex >= incoming.length) {
                        movedIndex = movedIndex - incoming.length;
                    }
                    if (movedIndex == i) {
                        break;
                    }
                    incoming[currentIndex] = incoming[movedIndex];
                    currentIndex = movedIndex;
                }
            } else if (delta < 0) {
                while (true) {
                    movedIndex = currentIndex + delta;
                    if (movedIndex < 0) {
                        movedIndex = incoming.length + movedIndex;
                    }
                    if (movedIndex == i) {
                        break;
                    }
                    incoming[currentIndex] = incoming[movedIndex];
                    currentIndex = movedIndex;
                }
            }
            incoming[currentIndex] = buffer;
        }
        return incoming;
    }

    static int greatestCommonDivisor(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return greatestCommonDivisor(b, a % b);
        }
    }

    public static void main(String[] args) {
        int[] array = ArrayUtils.generateArrayInRange(10, 0, 100);

        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter the specified number of positions: ");
        int position = sc.nextInt();
        ArrayUtils.printArray(array);
        int[] newArr = shiftArray(array, position);
        ArrayUtils.printArray(newArr);
    }

    private static int[] shiftArray(int[] array, int shift) {
        if (shift < 0) {
            return array;
        }
        shift = shift % array.length;
        if (shift == 0) {
            return array;
        }

        int[] newArr = new int[array.length];

        for (int i = 0; i < shift; i++) {
            newArr[i] = array[array.length - shift + i];
        }

        for (int i = shift; i < array.length; i++) {
            newArr[i] = array[i - shift];
        }
        return newArr;
    }
}
