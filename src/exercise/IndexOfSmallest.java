package exercise;

import java.util.ArrayList;
import java.util.Scanner;

/*
        Напишите программу, которая считывает числа от пользователя.
        При вводе числа 9999 процесс чтения останавливается.
        После этого программа напечатает наименьшее число в списке,
        а также индексы, по которым это число находится.
        Примечание: наименьшее число может появляться в списке несколько раз.
 */
public class IndexOfSmallest {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        boolean stop = false;

        while (!stop) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please, enter a number:");
            int number = sc.nextInt();
            numbers.add(number);

            if (number == 9999) {
                stop = true;
            }
        }

        int minNumber = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number < minNumber) {
                minNumber = number;
            }
        }
        for (int i = 0; i < numbers.size(); i++) {
            int currentNumber = numbers.get(i);
            if (currentNumber == minNumber) {
                System.out.println("Smallest number: " + currentNumber + "\nindex: " + i);
            }
        }
    }
}
