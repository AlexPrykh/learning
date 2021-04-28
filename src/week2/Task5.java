package week2;

import java.util.Arrays;

/*
    6. Заповнити масив випадковими значеннями.
       На парних індексах парними значеннями, на непарних індексах - непарними.
 */
public class Task5 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            int randomNumber = (int) (Math.random() * 100);

            if (i % 2 == 0) {
                array[i] = randomNumber % 2 == 0 ? randomNumber : randomNumber + 1;
            } else {
                array[i] = randomNumber % 2 != 0 ? randomNumber : randomNumber + 1;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
