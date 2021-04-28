package week1;

import java.util.Scanner;

/*
 9. Ввести значення трьох сторін трикутника a, b, c і визначити,
    чи трикутник прямокутний. Вивести результат в консоль.
 */
public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the side of the triangle a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of the side of the triangle b: ");
        int b = sc.nextInt();
        System.out.println("Enter the value of the side of the triangle c: ");
        int c = sc.nextInt();

        int a2 = ((int) Math.pow(a, 2));
        int b2 = ((int) Math.pow(b, 2));
        int c2 = ((int) Math.pow(c, 2));

        if (a2 == b2 + c2 || b2 == a2 + c2 || c2 == a2 + b2) {
            System.out.println("The triangle is right-angled!" + " a: " + a
                    + ", b: " + b + ", c: " + c);
        } else {
            System.out.println("The triangle is not right-angled!");
        }
    }
}
