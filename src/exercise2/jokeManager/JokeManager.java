package exercise2.jokeManager;

import java.util.ArrayList;
import java.util.Random;

/*
        Part 1: Joke Manager
        Создайте класс под названием JokeManager и переместите в него функции управления шутками.
        Класс должен иметь конструктор без параметров и следующие методы:

    1. public void addJoke(String joke) - шутит менеджер.
    2. public String drawJoke()- случайным образом выбирает одну шутку и возвращает ее.
    Если в диспетчере анекдотов нет сохраненных анекдотов, метод должен вернуть строку
    «Недостаточно анекдотов.».
    3. public void printJokes() - распечатывает все анекдоты, хранящиеся в менеджере анекдотов.

 */
public class JokeManager {
    private ArrayList<String> jokes;

    public JokeManager() {
        this.jokes = new ArrayList<String>();
    }

    public void addJoke(String joke) {
        this.jokes.add(joke);
    }

    public String drawJoke() {
        if (this.jokes.isEmpty()) {
            return "Jokes are in short supply.";
        } else {
            Random draw = new Random();
            int index = draw.nextInt(jokes.size());
            return jokes.get(index);
        }
    }

    public void printJokes() {
        if (jokes.isEmpty()) {
            System.out.println("There is not a single anecdote in the list.");
        } else {
            for (String joke : jokes) {
                System.out.println(joke);
            }
        }
    }
}