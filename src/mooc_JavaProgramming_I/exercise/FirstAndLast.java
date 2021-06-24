package mooc_JavaProgramming_I.exercise;

import java.util.ArrayList;
import java.util.Scanner;

/*
       В шаблоне упражнения есть программа, которая считывает вводимые
       пользователем данные и добавляет их в список.
       Чтение останавливается, когда пользователь вводит пустую строку.

    Измените программу так, чтобы она выводила как первое,
    так и последнее значение после окончания считывания.
    Вы можете предположить, что в список считываются как минимум два значения.
 */
public class FirstAndLast {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        boolean stop = false;

        while (!stop) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please, enter a name:");
            String name = sc.nextLine();

            if (name.isEmpty()) {
                stop = true;
            } else {
                names.add(name);
            }
        }

        System.out.println("First element in the list:\n" + names.get(0) +
                "\nLast elements in the list:\n" + names.get(names.size() - 1));
    }
}