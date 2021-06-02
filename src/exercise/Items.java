package exercise;

import java.util.ArrayList;
import java.util.Scanner;

/*
    Напишите программу, которая считывает имена предметов от пользователя.
    Если имя пусто, программа перестает читать. В противном случае данное имя
    используется для создания нового элемента, который вы затем добавите в items список.

    Прочитав все имена, распечатайте все элементы, используя toString метод
    Item класса. Реализация Item класса отслеживает время создания в дополнение к имени элемента.
 */
public class Items {
    private String nameItems;

    public Items(String nameItems) {
        this.nameItems = nameItems;
    }

    @Override
    public String toString() {
        return nameItems;
    }

    public static void main(String[] args) {
        ArrayList<Items> items = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a instrument name, empty will stop: ");
            String nameItem = sc.nextLine();
            if (nameItem.isEmpty()) {
                break;
            }
            items.add(new Items(nameItem));
        }
        System.out.println();
        System.out.println("Items in total: " + items.size());
        System.out.println("Items:");
        for (Items item : items) {
            System.out.println(item);
        }
    }
}
