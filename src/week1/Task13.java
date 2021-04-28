package week1;

import java.util.Scanner;

/*
    13. Дано 3 числа a, b, c. Визначити, чи є серед них хоча б пара рівних.
 */
public class Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter first number a:");
        int a = sc.nextInt();
        System.out.println("Please, enter second number b:");
        int b = sc.nextInt();
        System.out.println("Please, enter third number c:");
        int c = sc.nextInt();

        if (a == b || b == c || a == c) {
            System.out.println("Among the three numbers there are two levels!");
        } else {
            System.out.println("All three numbers are different!");
        }
    }
}
