package mooc_JavaProgramming_I.exercise3.gradeStatistics;

import java.util.Scanner;

public class UserInterface {
    //Instance and Class variables
    private Scanner scanner;
    private GradeRegister register;

    public UserInterface(Scanner scanner, GradeRegister register) {
        this.scanner = scanner;
        this.register = register;
    }

    //Method to start the program
    public void start() {
        readPoints();
        System.out.println();
        printAverageAll();
        printAveragePassing();
        printPassingPercentage();
        printGradeDistribution();
    }

    //Method to read and store the points input
    public void readPoints() {
        System.out.println("Enter points totals, -1 stops:");

        while (true) {
            String input = scanner.nextLine();

            int points = Integer.parseInt(input);

            if (points == -1) {
                break;
            } else if (points < 0 || points > 100) {
                System.out.println("Impossible number!");
                continue;
            }
            this.register.addPoints(points);
        }
    }

    // Print the average of all points
    public void printAverageAll() {
        System.out.println("Point average (all): " + register.averageOfPointsAll());
    }

    // Print the average of passing points
    public void printAveragePassing() {
        String nonePassing = "-";

        if (register.averageOfPassingPoints() == 0.00) {
            System.out.println("Point average (passing): " + nonePassing);
        } else {
            System.out.println("Point average (passing): " + register.averageOfPassingPoints());
        }
    }

    // Print the percentage of points that are passing out of the total
    public void printPassingPercentage() {
        System.out.println("Pass percentage: " + register.passPercentage());
    }

    // Print the grade distribution using stars to represent numbers of grades
    public void printGradeDistribution() {
        System.out.println("Grade distribution:");

        int grade = 5;

        while (grade >= 0) {
            int stars = register.totalGradesFromPoints(grade);
            System.out.print(grade + ": ");
            printStars(stars);
            System.out.println("");

            grade--;
        }
    }

    // Print the number of stars for total number of grades horizontally
    public static void printStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }
}
