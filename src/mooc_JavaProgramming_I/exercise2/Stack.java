package mooc_JavaProgramming_I.exercise2;

import java.util.ArrayList;

/*
        Стек - это структура данных, которую вы можете добавлять и извлекать.
        Всегда наверху или сверху.

        Part 1:
        Создайте Stack класс со списком строк в качестве переменной экземпляра.
        Добавьте в класс следующие методы:

    public boolean isEmpty()- возвращает boolean значение типа (истина или ложь),
    которое сообщает, пуст ли стек.
    public void add(String value) - Добавляет значение, указанное в качестве параметра,
    в верхнюю часть стека.
    public ArrayList<String> values() - возвращает значения, содержащиеся в стеке, в виде списка.

        Part 2:
        Добавьте к Stack классу public String take() метод, который возвращает самое верхнее
        значение (т.e. последнее значение, добавленное в двухстороннюю очередь) и удаляет
        его из стека.
 */
public class Stack {
    private ArrayList<String> stack;

    public Stack() {
        this.stack = new ArrayList<>();
    }

    public boolean isEmpty() {
        return this.stack.size() == 0;
    }

    public void add(String value) {
        this.stack.add(value);
    }

    public ArrayList<String> values() {
        return this.stack;
    }

    public String take() {
        return this.stack.remove(0);
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        s.add("Value");
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        String taken = s.take();
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        System.out.println(taken);
    }
}
