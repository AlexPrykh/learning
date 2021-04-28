package week1;

import java.util.Scanner;

/*
    2. Користувач вводить три числа з консолі, потрібно вивести в консоль найбільше та найменше.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter a number 1:");
        int number1 = sc.nextInt();
        System.out.println("Please, enter a number 2:");
        int number2 = sc.nextInt();
        System.out.println("Please, enter a number 3:");
        int number3 = sc.nextInt();

        int max = 0;
        if (number1 > number2 && number1 > number3) {
            max = number1;
        } else if (number2 > number1 && number2 > number3) {
            max = number2;
        } else {
            max = number3;
        }
        System.out.println("Max: " + max);

        int min = 0;
        if (number1 < number2 && number1 < number3) {
            min = number1;
        } else if (number2 < number1 && number2 < number3) {
            min = number2;
        } else {
            min = number3;
        }
        System.out.println("Min: " + min);
    }
}
