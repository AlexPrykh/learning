import array.ArrayUtils;

import java.util.Arrays;
import java.util.Scanner;
/*
        Дано:
    ⁃ Масив довжиною n
    ⁃ Середнє арфиметичне масиву (потрібно вирахувати), нехай це буде змінна avg
    Потрібно зробити і вивести в консоль новий масив.
    В новому масиві мають бути тільки ті елементи з оригінального масиву,
    які лежать в межах від avg - 25% до avg + 25%.
 */

public class ClippingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = ArrayUtils.generateArrayInRange(10, 0, 100);
        System.out.println(Arrays.toString(array));
        int average = ArrayUtils.arraySum(array) / array.length;
        System.out.println("Average arithmetic in array: " + average);

        //System.out.println("Please, enter the percentage that will be in the range of the number:");
        double enteredPercentage = 0.25;

        double percentLeft = average * (1 - enteredPercentage);
        double percentRight = average * (1 + enteredPercentage);

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > percentLeft && array[i] < percentRight) {
                count++;
            }
        }

        int[] newArray = new int[count];
        int resultArrayindex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > percentLeft && array[i] < percentRight) {
                newArray[resultArrayindex++] = array[i];
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}