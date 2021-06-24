package mooc_JavaProgramming_I.exercise3.liquidContainers_2;

import java.util.Scanner;

/*
        Part 2: Functionality
        Скопируйте пользовательский интерфейс, реализованный для предыдущего примера,
        и измените его, чтобы использовать новый класс Container. Основной метод в классе
        LiquidContainers2 должен запускать программу.
 */
public class liquidContainers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Container firstContainer = new Container();
        Container secondContainer = new Container();

        UserInterface userInterface = new UserInterface(firstContainer, secondContainer, scanner);
        userInterface.start();
    }
}
