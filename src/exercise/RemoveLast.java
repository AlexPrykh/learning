package exercise;

import java.util.ArrayList;

/*
    Создайте метод public static void removeLast(ArrayList<String> strings)
    в шаблоне упражнения. Метод должен удалить последнее значение в списке,
    который он получает в качестве параметра. Если список пуст, метод ничего не делает.
 */
public class RemoveLast {
    public static void removeLast(ArrayList<String> strings) {
        if (!strings.isEmpty()) {
            strings.remove(strings.size() - 1);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();

        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        System.out.println(strings);

        removeLast(strings);
        removeLast(strings);

        System.out.println(strings);
    }
}
