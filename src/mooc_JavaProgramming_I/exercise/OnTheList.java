package mooc_JavaProgramming_I.exercise;

import java.util.ArrayList;
import java.util.Scanner;

/*
        В шаблоне упражнения есть программа, которая считывает
        вводимые пользователем данные до тех пор, пока не будет
        введена пустая строка. Добавьте к нему следующий функционал:
        после чтения входных данных у пользователя запрашивается еще одна строка.
        Затем программа сообщает, была ли эта строка найдена в списке или нет.
 */
public class OnTheList {
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

        System.out.println("What name do you want to find?");
        Scanner sc = new Scanner(System.in);
        String requestedName = sc.nextLine();

        System.out.println("Is this name on the list?\n" + names.contains(requestedName));
    }
}
