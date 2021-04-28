package week1;

import java.util.Scanner;

/*
    23. Відомі площі кола та квадрата. Визначити:
	а) чи поміститься коло в квадрат;
	б) чи поміститься квадрат в коло.
 */
public class Task23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pleast, enter the area of the circle:");
        double ciarcleArea = sc.nextDouble();
        System.out.println("Pleast, enter the area of the square:");
        double squareArea = sc.nextDouble();

        double angle, radius;
        angle = Math.sqrt(squareArea / 2);
        radius = Math.sqrt(ciarcleArea / Math.PI);

        if (radius <= angle) {
            System.out.println("Will fit!");
        } else {
            System.out.println("Will not fit!");
        }
    }
}
