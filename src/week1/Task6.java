package week1;

import java.util.Scanner;

/*
    6. Вводимо 2 числа, вивести їх суму, якщо вона в діапазоні від 11 до 19.
 */
public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter a number 1:");
        int number1 = sc.nextInt();
        System.out.println("Please, enter a number 2:");
        int number2 = sc.nextInt();

        int sum = number1 + number2;

        if (sum >= 11 && sum <= 19) {
            System.out.println("The amount is in the range from 11 to 19: " + sum);
        } else {
            System.out.println("The amount is not in the range from 11 to 19: " + number1
                    + " and " + number2);
        }
    }
}
