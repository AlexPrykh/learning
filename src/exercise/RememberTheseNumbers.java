package exercise;

import java.util.ArrayList;
import java.util.Scanner;

/*
        Шаблон упражнения содержит базу, которая считывает числа
        от пользователя и добавляет их в список. Чтение останавливается,
        как только пользователь вводит число -1.

     Расширить функционал программы, чтобы после считывания чисел
     она распечатывала все числа, полученные от пользователя.
     Число, используемое для обозначения остановки, не следует печатать.
 */
public class RememberTheseNumbers {
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
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
