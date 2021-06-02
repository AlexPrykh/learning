package exercise;

import java.util.ArrayList;
import java.util.Scanner;

/*
        Шаблон упражнения содержит базу, которая считывает числа
        от пользователя и добавляет их в список. Чтение останавливается,
        как только пользователь вводит число -1.

      Продолжайте разработку программы так, чтобы она находила
      наибольшее число в списке и печатала его значение после
      прочтения всех чисел. Программирование должно работать следующим образом.
 */
public class GreatestInList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        boolean stop = false;

        while (!stop) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please, enter a number:");
            int number = sc.nextInt();
            numbers.add(number);

            if (number == -1) {
                stop = true;
            }
        }

        int maxNumber = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > maxNumber) {
                maxNumber = number;
            }
        }
        System.out.println("Max number: " + maxNumber);
    }
}
