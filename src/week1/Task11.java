package week1;

import java.util.Scanner;

/*
    11. Дано трьохзначне число (вводиться користувачем). Визначити:
	а) чи всі його цифри однакові
	б) чи є серед його цифр однакові
 */
public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter a three-digit number: ");
        int number = sc.nextInt();

        if (number >= 100 && number <= 999) {
            int a = number % 10;
            number = number / 10;
            int b = number % 10;
            number = number / 10;
            int c = number;

            if (a == b && b == c) {
                System.out.println("All numbers are the same!");
            } else if (a == b || b == c || c == a) {
                System.out.println("Two numbers are the same!");
            } else {
                System.out.println("None of the numbers is the same!");
            }
        }
    }
}
