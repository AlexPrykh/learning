package exercise2.toDoList;

import java.util.Scanner;

/*
        Part 2: Пользовательский интерфейс
        Реализуйте класс с именем UserInterface. У него должен быть конструктор
        с двумя параметрами. Первый параметр - это экземпляр класса TodoList,
        а второй - экземпляр класса Scanner. Помимо конструктора, класс должен
        иметь метод, public void start() который используется для запуска текстового
        пользовательского интерфейса. Текстовый интерфейс пользователя работает с оператором
        вечного цикла ( while-true) и должен предлагать пользователю следующие команды:

    1. Команда stop останавливает выполнение цикла, после чего выполнение программы выходит за
    пределы start метода.
    2. Команда add запрашивает у пользователя добавление следующей задачи.
    Как только пользователь входит в эту задачу, она должна быть добавлена в список дел.
    3. Команда list распечатывает все задачи в списке дел.
    4. Команда remove просит пользователя ввести идентификатор удаляемой задачи.
    После ввода указанная задача должна быть удалена из списка задач.


 */
public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Command:");
            String command = scanner.nextLine();

            if (command.contains("stop")) {
                break;
            } else if (command.contains("add")) {
                System.out.println("Add a task:");
                String addATask = scanner.nextLine();
                todoList.add(addATask);
            } else if (command.contains("list")) {
                todoList.print();
                if (todoList.isEmpty()) {
                    System.out.println("You have no tasks.");
                }
            } else if (command.contains("remove")) {
                System.out.println("Which task should you delete?");
                int delete = Integer.parseInt(scanner.nextLine());
                todoList.remove(delete);
            }
        }
    }
}
