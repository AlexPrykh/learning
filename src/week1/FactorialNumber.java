package week1;

import java.util.Scanner;

/*
    Визначити факторіал числа.
 */
public class FactorialNumber {
    static int calculateFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter the number from which you want to determine the factorial:");
        int factorial = sc.nextInt();
        System.out.println("Factorial number: " + factorial + "\n" + calculateFactorial(factorial));
    }
}
