package mooc_JavaProgramming_I.exercise2.jokeManager;

import java.util.Scanner;

/*
        Part 2: User interface
        Создайте класс с именем UserInterface и переместите туда функциональность
        пользовательского интерфейса программы. У класса должен быть конструктор с
        двумя параметрами. Первый параметр - это экземпляр класса JokeManager, а второй
        параметр - экземпляр класса Scanner. Кроме того, у класса должен быть метод,
        public void start() который можно использовать для запуска пользовательского интерфейса.

    Пользовательский интерфейс должен предоставлять пользователю следующие команды:

    X- окончание: выход из метода start.
    1 - добавление: просит пользователя добавить шутку в диспетчер шуток, а затем добавляет ее.
    2- рисунок: выбирает случайную шутку из менеджера шуток и распечатывает ее. Если в
       менеджере нет приколов, то будет напечатана строка «Jokes are in short supply.».
    3 - печать: распечатывает все анекдоты, хранящиеся в диспетчере анекдотов.
 */
public class UserInterface {
    private JokeManager jokes;
    private Scanner scanner;

    public UserInterface(JokeManager jokes, Scanner scanner) {
        this.jokes = jokes;
        this.scanner = scanner;
    }

    public void start() {
        System.out.println("What a joke!");

        while (true) {
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");

            String command = scanner.nextLine();

            if (command.equals("X")) {
                break;
            }

            if (command.equals("1")) {
                System.out.println("Write the joke to be added:");
                String joke = scanner.nextLine();
                jokes.addJoke(joke);
            } else if (command.equals("2")) {
                System.out.println("Drawing a joke.");
                String drawJoke = jokes.drawJoke();
                System.out.println(drawJoke);
            } else if (command.equals("3")) {
                System.out.println("Printing the jokes.");
                jokes.printJokes();
            }
        }
    }
}
