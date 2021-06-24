package mooc_JavaProgramming_I.exercise;

import java.util.ArrayList;
import java.util.Scanner;

/*
      В шаблоне упражнения есть программа, которая считывает вводимые
      пользователем данные и добавляет их в список.
      Чтение останавливается, когда пользователь вводит пустую строку.

    Ваша задача - изменить метод, чтобы печатать последнее прочитанное
    значение после того, как оно прекратит чтение.
    Выведите значение, которое было прочитано последним из списка.
    Используйте метод, который сообщает размер списка, чтобы вам помочь.
 */

public class LastInList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        boolean stop = false;

        while (!stop) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please, enter a name:");
            String name = sc.nextLine();

            if (name.equals("")) {
                stop = true;
            } else {
                names.add(name);
            }
        }
        System.out.println("Last name in list:\n" + names.get(names.size() - 1));
    }
}
