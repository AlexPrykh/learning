package week1;

import java.util.Scanner;

/*
    3. Користувач вводить число. Вивести на екран його подвоєне значення,
       якщо число ділиться на 7 без остачі.
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter a number:");
        int number = sc.nextInt();
        int remainder = number % 7;

        if (remainder != 0) {
            System.out.println("Double value: " + number * 2);
        } else {
            System.out.println("Divided without remainder: " + number);
        }
    }
}
