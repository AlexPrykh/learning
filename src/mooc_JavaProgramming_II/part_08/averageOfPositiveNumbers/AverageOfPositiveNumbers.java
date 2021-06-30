package mooc_JavaProgramming_II.part_08.averageOfPositiveNumbers;

import java.util.Scanner;

/*
        Напишите программу, котороя запрашивает у пользователя ввод до тех пор, пока пользователь
        не введет 0. После этого программа распечатает среднее значение положительных чисел
        (числа больше нуля).

        Если положительное число не введено, программа выводит сообщение
        «Невозможно вычислить среднее».
 */
public class AverageOfPositiveNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        int count = 0;

        while (true) {
            System.out.println("Please, enter a number:");
            int number = Integer.parseInt(sc.nextLine());
            if (number == 0) {
                break;
            }

            if (number > 0) {
                sum += number;
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Unable to calculate average!");
        } else {
            System.out.println("Average of numbers: " + sum / count);
        }
    }
}
