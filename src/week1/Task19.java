package week1;

import java.util.Scanner;

/*
    19. Написати програму, яка при введені числа в діапазоні від 1 до 99 додає до нього слово "копійка"
        в правильному форматі. Наприклад, 1 копійка, 2 копійки, 7 копійок.
 */
public class Task19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = scanner.nextInt();

        if (number >= 1 && number <= 99) {
            if (number >= 11 && number <= 14) {
                System.out.println(number + " копійок");
            } else {
                int lastNumber = number % 10;

                if (lastNumber >= 5 || lastNumber == 0) {
                    System.out.println(number + " копійок");
                } else if (lastNumber >= 2) {
                    System.out.println(number + " копійки");
                } else {
                    System.out.println(number + " копійка");
                }
            }
        }
    }
}
