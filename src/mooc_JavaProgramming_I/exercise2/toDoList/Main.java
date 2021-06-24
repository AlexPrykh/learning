package mooc_JavaProgramming_I.exercise2.toDoList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Part: 1");
        TodoList list = new TodoList();
        list.add("read the course material");
        list.add("watch the latest fool us");
        list.add("take it easy");
        list.print();
        System.out.println();
        list.remove(2);
        list.print();
        System.out.println();
        list.add("buy raisins");
        list.print();
        System.out.println();
        list.remove(1);
        list.remove(1);
        list.print();
        System.out.println();

        System.out.println("Part 2:");
        Scanner scanner = new Scanner(System.in);
        TodoList list2 = new TodoList();
        UserInterface ui = new UserInterface(list2, scanner);
        ui.start();
    }
}
