package exersize2.averages;

import java.util.Scanner;

/*
        Part 3: Печать в пользовательском интерфейсе
        В качестве последнего шага добавьте реализованные выше методы как части
        пользовательского интерфейса. Когда программа распечатывает распределение оценок,
        она также должна распечатать средние значения баллов и оценок.
 */
public class UserInterface {
    private GradeRegister register;
    private Scanner scanner;

    public UserInterface(GradeRegister register, Scanner scanner) {
        this.register = register;
        this.scanner = scanner;
    }

    public void start() {
        readPoints();
        System.out.println("");
        printGradeDistribution();
    }

    public void readPoints() {
        while (true) {
            System.out.print("Points: ");
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            int points = Integer.parseInt(input);

            if (points < 0 || points > 100) {
                System.out.println("Impossible number.");
                continue;
            }

            this.register.addGradeBasedOnPoints(points);
        }
    }

    public void printGradeDistribution() {
        int grade = 5;
        while (grade >= 0) {
            int stars = register.numberOfGrades(grade);
            System.out.print(grade + ": ");
            printsStars(stars);
            System.out.println("");

            grade -= 1;
        }
        System.out.println("The average of points: " + register.averageOfPoints());
        System.out.println("The average of grades: " + register.averageOfGrades());

    }

    public static void printsStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }
}
