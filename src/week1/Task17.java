package week1;

import java.util.Scanner;

/*
    17. Написати програму для визначення іделаьної ваги користувача (зріст - 100).
        Надати рекомендації стосовно того, необхідно набрати чи скинути вагу.
 */
public class Task17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter your height in meters:");
        double height = sc.nextDouble();
        System.out.println("Please, enter your weight in kilograms:");
        double weight = sc.nextDouble();

        double bodyMassIndex = weight / (height * height);

        System.out.println("Calculation of body weight: " + "\nLess 18.5 - indicates underweight;" +
                "\n18.5 - 24.9 - equivalent to normal body weight;" +
                "\n25.0 - 29.9 - indicates the presence of excess weight;" +
                "\nOver 30 - is a sign of obesity.");

        System.out.println();

        if (bodyMassIndex < 18.5) {
            System.out.println("You need to gain weight!. Your body mass index: " + bodyMassIndex);
        } else if (bodyMassIndex >= 18.5 && bodyMassIndex <= 24.9) {
            System.out.println("Your weight is normal. Your body mass index: " + bodyMassIndex);
        } else if (bodyMassIndex >= 25.0 && bodyMassIndex <= 29.9) {
            System.out.println("You are overweight, you need to lose a little weight." +
                    " Your body mass index: " + bodyMassIndex);
        } else if (bodyMassIndex >= 30) {
            System.out.println("You are overweight, take care of your body's immediately!" +
                    " Your body mass index: " + bodyMassIndex);
        } else {
            System.out.println("Error! Indicators are entered incorrectly!");
        }
    }
}
