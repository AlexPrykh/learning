package exercise;

import java.util.ArrayList;
import java.util.Date;
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
    private Date date;

    public Items(String nameItems) {
        this.nameItems = nameItems;
        this.date = new Date();
    }

    @Override
    public String toString() {
        return String.format("Name: %s, date: %s", nameItems, date);
    }

    public static void main(String[] args) {
        ArrayList<Items> items = new ArrayList<>();

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a instrument name, empty will stop: ");
            String nameItem = sc.nextLine();
            if (nameItem.isEmpty()) {
                break;
            } else {
                items.add(new Items(nameItem));
            }
            System.out.println();
            System.out.println("Items in total: " + items.size());
        }
        System.out.println("Items in total: " + items.size());
        System.out.println("Items:");
        for (Items item : items) {
            System.out.println(item);
        }
    }
}