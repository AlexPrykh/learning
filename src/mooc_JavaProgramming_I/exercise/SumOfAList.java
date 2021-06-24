package mooc_JavaProgramming_I.exercise;

import java.util.ArrayList;
import java.util.Scanner;

/*
            Шаблон упражнения содержит базу, которая считывает числа
            от пользователя и добавляет их в список.
            Чтение останавливается, как только пользователь вводит число -1.

        Измените программу так, чтобы после чтения чисел
        она вычисляла и печатала сумму чисел в списке.
 */
public class SumOfAList {
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

        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println("Sum numbers: " + sum);
    }
}
