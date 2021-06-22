package exercise2.jokeManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        JokeManager jokes = new JokeManager();

        Scanner scanner = new Scanner(System.in);

        UserInterface userInterface = new UserInterface(jokes, scanner);

        userInterface.start();

    }
}
