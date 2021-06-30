package mooc_JavaProgramming_II.part_08.toDoList;

import java.util.ArrayList;

/*
        Part 1: Список дел
        Создайте класс с именем TodoList. У него должен быть конструктор без параметров
        и следующие методы:

    1. public void add(String task) - добавить задачу, переданную в качестве параметра, в список дел.
    2. public void print()- распечатывает упражнения. Каждая задача имеет номер, связанный с ней
    в  операторе печати - используйте здесь индекс задачи (+1).
    3. public void remove(int number)- удаляет задачу, связанную с заданным номером;
       это номер, связанный с задачей на распечатке.
 */
public class TodoList {
    private ArrayList<String> todoList;

    public TodoList() {
        this.todoList = new ArrayList<>();
    }

    public void add(String task) {
        this.todoList.add(task);
    }

    public void print() {
        for (String toDo : todoList) {
            System.out.println(todoList.indexOf(toDo) + 1 + ": " + toDo);
        }
    }

    public void remove(int number) {
        this.todoList.remove(number - 1);
    }

    public boolean isEmpty() {
        return todoList.size() == 0;
    }
}
