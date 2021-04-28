package week1;

import java.util.Scanner;

/*
    7. Вводимо 2 числа, якщо одне з них ділиться на інше без остачі, виводимо "true" і показуємо
       результат ділення (цілу частину та остачу від ділення),
       в іншому випадку виводимо "false" і показуємо результат ділення (цілу частину і остачу).
 */
public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter a number 1:");
        int number1 = sc.nextInt();
        System.out.println("Please, enter a number 2:");
        int number2 = sc.nextInt();

        int division = number1 / number2;
        int remainder = number1 % number2;

        if (remainder == 0) {
            System.out.println("True! Division result: " + division + ", remainder: " + remainder);
        } else {
            System.out.println("False! Division result: " + division + ", remainder: " + remainder);
        }
    }
}
