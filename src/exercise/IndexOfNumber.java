package exercise;

import java.util.ArrayList;
import java.util.Scanner;

/*
        Шаблон упражнения содержит базу, которая считывает числа
        от пользователя и добавляет их в список.
        Чтение останавливается, как только пользователь вводит число -1.

      Расширьте программу, добавив функцию, которая запрашивает
      у пользователя номер и сообщает индекс этого номера в списке.
      Если номер не найден, программа не должна ничего печатать.
 */
public class IndexOfNumber {
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

        System.out.println("Enter the number you want to find:");
        Scanner sc = new Scanner(System.in);
        int numberFind = sc.nextInt();
        int index = numbers.indexOf(numberFind);
        if (index != -1) {
            System.out.println("Found number at index: " + index);
        } else {
            System.out.println("Number not found.");
        }
    }
}