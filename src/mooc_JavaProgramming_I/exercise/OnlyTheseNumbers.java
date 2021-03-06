package mooc_JavaProgramming_I.exercise;

import java.util.ArrayList;
import java.util.Scanner;

/*
       Шаблон упражнения содержит базу, которая считывает числа от пользователя
       и добавляет их в список. Чтение останавливается, как только пользователь вводит число -1.

     Разверните программу, чтобы запросить начальный и конечный индексы,
     когда она закончит запрашивать числа. После этого программа распечатает
     все числа в списке, попадающие в указанный диапазон
     (между указанными пользователем индексами включительно).
     Вы можете предположить, что пользователь задает индексы,
     соответствующие некоторым числам в списке.
 */
public class OnlyTheseNumbers {
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
        Scanner sc = new Scanner(System.in);
        System.out.println("What index will we start with:");
        int startIndex = sc.nextInt();
        System.out.println("What index will we end with:");
        int endIndex = sc.nextInt();

        sc.nextLine();

        for (int i = startIndex - 1; i < endIndex; i++) {
            System.out.print(numbers.get(i) + "|");
        }
    }
}