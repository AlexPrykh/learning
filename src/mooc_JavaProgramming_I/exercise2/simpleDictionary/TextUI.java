package mooc_JavaProgramming_I.exercise2.simpleDictionary;

import java.util.Scanner;

/*
        Part 1: Запуск и остановка пользовательского интерфейса
        Реализуйте класс, TextUI который получает в качестве параметров конструктора
        Scanner и SimpleDictionary объекты. Затем дайте классу вызываемый метод
        public void start(). Метод должен работать следующим образом:

    1. Метод запрашивает у пользователя команду
    2. Если есть команда end, пользовательский интерфейс печатает строку «Bye bye!»
       и выполнение start метода заканчивается.
    3. В противном случае текстовый пользовательский интерфейс печатает сообщение
       Unknown command и запрашивает новую команду, поэтому он возвращается к шагу 1.

        Part 2: Добавление перевода
        Измените метод public void start() так, чтобы он работал следующим образом:

    1. Метод запрашивает у пользователя команду.
    2. Если есть команда end, пользовательский интерфейс печатает строку «Bye bye!»
       и выполнение start метода заканчивается.
    3. Если есть команда add, текстовый интерфейс пользователя запрашивает у пользователя
       слово и перевод, каждое в отдельной строке. После этого слова сохраняются в словаре,
       и метод продолжается, запрашивая новую команду (возвращается к этапу 1).
       В противном случае текстовый пользовательский интерфейс печатает сообщение
       Unknown command и запрашивает новую команду, поэтому он возвращается к шагу 1.

       Part 3: Перевод слова
       Измените метод public void start()так, чтобы он работал следующим образом:

    1. Метод запрашивает у пользователя команду.
    2. Если есть команда end, пользовательский интерфейс печатает строку «Bye bye!»
       и выполнение start метода заканчивается.
    3. Если есть команда add, текстовый интерфейс пользователя запрашивает у пользователя
       слово и перевод, каждое в отдельной строке. После этого слова сохраняются в словаре,
       и метод продолжается, запрашивая новую команду (возвращается к этапу 1).
    4. Если есть команда search, текстовый интерфейс пользователя запрашивает у пользователя
       слово для перевода. После этого он печатает перевод слова, и метод продолжается,
       запрашивая новую команду (возвращается к этапу 1).
    5. В противном случае текстовый пользовательский интерфейс печатает сообщение
       Unknown command и запрашивает новую команду, поэтому он возвращается к шагу 1.

       Part 4: Очистка перевода
       Измените функцию поиска пользовательского интерфейса, чтобы, если слово не найдено
       (т.e. dictionary возвращал null),  пользовательский интерфейс печатает сообщение
       "Word (searched word) was not found".
 */
public class TextUI {
    private Scanner scanner;
    private SimpleDictionary simpleDictionary;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }

    public void start() {
        while (true) {
            System.out.println("Command:");
            String command = scanner.nextLine();

            if (command.contains("end")) {
                System.out.println("Bye, bye!");
                break;
            } else if (command.contains("add")) {
                System.out.println("Word:");
                String word = scanner.nextLine();
                System.out.println("Translation:");
                String translation = scanner.nextLine();
                simpleDictionary.add(word, translation);
            } else if (command.contains("search")) {
                System.out.println("To be translated:");
                String translatedWord = scanner.nextLine();
                String returnTranslation = simpleDictionary.translate(translatedWord);
                if (returnTranslation == null) {
                    System.out.println("Word " + translatedWord + " was not found.");
                } else {
                    System.out.println(returnTranslation);
                }
            } else {
                System.out.println("Unknown command.");
                continue;
            }
        }
    }
}
