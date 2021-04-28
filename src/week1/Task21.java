package week1;

import java.util.Scanner;

/*
    21. Дано три числа A,B,C. Збільшити їх в 2 рази, якщо їх сума більше 0, інакше замінити на 0.
 */
public class Task21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter a first number A:");
        int a = sc.nextInt();
        System.out.println("Please, enter a second number B:");
        int b = sc.nextInt();
        System.out.println("Please, enter a third number C:");
        int c = sc.nextInt();

        if (a + b + c > 0) {
            System.out.println("A: " + (Math.pow(a, 2)) + ";" + "\nB: " + (Math.pow(b, 2)) + ";" +
                    "\nC: " + (Math.pow(c, 2)) + ".");
        } else if (a + b + c < 0) {
            a = 0;
            b = 0;
            c = 0;
            System.out.println("A: " + a + ";" + "\nB: " + b + ";" + "\nC: " +
                    c + ".");
        } else {
            System.out.println("Error! Check that the data entry is correct!");
        }
    }
}
