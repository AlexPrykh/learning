package week1;

import java.util.Scanner;

/*
    4. Вводимо число з плаваючою точкою в консолі, перевіряємо,
       чи лежить воно в діапазоні від 0 до 1.
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter a floating point number:");
        double number = sc.nextDouble();

        if (number >= 0 && number <= 1) {
            System.out.println("The number is in the range from 0 to 1: " + number);
        } else {
            System.out.println("The number is not lies in the range from 0 to 1: " + number);
        }
    }
}
