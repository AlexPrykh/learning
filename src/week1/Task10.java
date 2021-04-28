package week1;

import java.util.Scanner;

/*
    10. Ввести 3 числа, додатні піднести до 3-ї степені, від*ємні замінити на 0.
 */
public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter a number 1: ");
        int first = sc.nextInt();
        System.out.println("Please, enter a number 2: ");
        int second = sc.nextInt();
        System.out.println("Please, enter a number 3: ");
        int third = sc.nextInt();

        if (first >= 0) {
            System.out.println("The first number is a positive and elevated to the third power: " +
                    "\nFirst number: " + (Math.pow(first, 3)));
        } else {
            first = 0;
            System.out.println("The first number is a negative and is replased by 0: " +
                    "\nFirst number = " + first);
        }
        if (second >= 0) {
            System.out.println("The second number is a positive and elevated to the third power: " +
                    "\nSecond number: " + (Math.pow(second, 3)));
        } else {
            second = 0;
            System.out.println("The second number is a negative and is replased by 0: " +
                    "\nSecond number = " + second);
        }
        if (third >= 0) {
            System.out.println("The third number is a positive and elevated to the third power: " +
                    "\nThird number: " + (Math.pow(third, 3)));
        } else {
            third = 0;
            System.out.println("The third number is a negative and is replased by 0: " +
                    "\nThird number = " + third);
        }
    }
}
