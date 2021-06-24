package mooc_JavaProgramming_I.exercise;

import java.util.ArrayList;
import java.util.Scanner;

/*
        Шаблон упражнения содержит базу, которая считывает числа
        от пользователя и добавляет их в список.
        Чтение останавливается, как только пользователь вводит число -1.

    Когда чтение закончится, вычислите среднее значение чисел в нем,
    а затем распечатайте это значение.
 */
public class AverageOfAList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        boolean stop = false;

        while (!stop) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please, enter a number:");
            int number = sc.nextInt();

            if (number == -1) {
                stop = true;
            } else {
                numbers.add(number);
            }
        }

        double sum = 0;

        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        double average = sum / numbers.size();

        System.out.println("Average of a list: " + average);
    }
}
