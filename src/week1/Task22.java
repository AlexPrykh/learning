package week1;

import java.util.Scanner;

/*
    22. Визначити, чи являється 6-значне число "щасливим"
        (сума перших трьох цифр дорівнює сумі останніх трьох).
 */
public class Task22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter a six-digit number:");
        int number = sc.nextInt();

        if (number >= 100_000 && number <= 999_999) {
            int first = number / 100_000;
            int second = number / 10_000 % 10;
            int third = number / 1_000 % 10;
            int fourth = number / 100 % 10;
            int fifth = number / 10 % 10;
            int sixth = number % 10;

            int sum1 = first + second + third;
            int sum2 = fourth + fifth + sixth;

            if (sum1 == sum2) {
                System.out.println("Lucky number!" + "\n" +
                        sum1 + " - the sum of the first three numbers;" + "\n" +
                        sum2 + " - the sum of the last three numbers.");
            } else {
                System.out.println("Get lucky another time!");
            }
        } else {
            System.out.println("Error! Check that the data entry is correct!");
        }
    }
}
