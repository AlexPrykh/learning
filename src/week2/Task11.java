package week2;

import java.util.Scanner;

/*
    11. Перевірити, чи являється задане число простим.
 */
public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please a number:");
        int number = sc.nextInt();

        boolean isComposite = false;

        for (int i = 2; i < number && !isComposite; i++) {
            if (number % i == 0) {
                isComposite = true;
            }
        }
        if (isComposite) {
            System.out.println("The number is compound!");
        } else {
            System.out.println("The number is prime!");
        }
    }
}
