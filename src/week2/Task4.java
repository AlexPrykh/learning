package week2;

import array.ArrayUtils;

import java.util.Scanner;

/*
    4. Порахувати, скільки разів зустрічається число
       (число задає користувач) в масиві.
 */
public class Task4 {
    public static void main(String[] args) {
        int[] array = ArrayUtils.generateArrayInRange(10, 0, 100);
        ArrayUtils.printArray(array);

        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter the number that will appear in the array:");
        int number = sc.nextInt();
        int count = 0;

        for (int current : array) {
            if (current == number) {
                count++;
            }
        }

        ArrayUtils.printArray(array);
        System.out.println("Occurs times: " + count);
    }
}
