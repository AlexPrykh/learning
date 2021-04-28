package week1;

import java.util.Scanner;

/*
    5. Вводимо 2 числа. Якщо перше більше, ніж друге, вивести на екран різницю чисел.
       Якщо друге більше, вивести суму.
 */
public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter a number 1:");
        int number1 = sc.nextInt();
        System.out.println("Please, enter a number 2:");
        int number2 = sc.nextInt();

        if (number1 > number2) {
            System.out.println("First > second+ " + (number1 - number2));
        } else {
            System.out.println("First < second: " + (number1 + number2));
        }
    }
}
