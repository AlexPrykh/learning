package mooc_JavaProgramming_I.exercise3.liquidContainers_2;

import java.util.Scanner;

public class UserInterface {
    private Container firstContainer;
    private Container secondContainer;
    private Scanner scanner;

    public UserInterface(Container firstContainer, Container secondContainer, Scanner scanner) {
        this.firstContainer = firstContainer;
        this.secondContainer = secondContainer;
        this.scanner = scanner;
    }

    public void start() {
        printStartInfo();

        while (true) {
            // read user input
            String input = scanner.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.parseInt(parts[1]);

            processCommand(command, amount);
        }
        System.out.println("First : " + firstContainer);
        System.out.println("Second : " + secondContainer);
    }

    private void processCommand(String command, int amount) {
        if (command.equals("add")) {
            add(amount);
        } else if (command.equals("move")) {
            move(amount);
        } else if (command.equals("remove")) {
            remove(amount);
        }
    }

    private void printStartInfo() {
        System.out.println("Commands:");
        System.out.println("- add 'amount' - adds the amount of liquid to the first container");
        System.out.println("- move 'amount' - moves the amount of liquid to the second container");
        System.out.println("- remove 'amount' - removes the amount of liquid in the second container");
        System.out.println();
        System.out.println("Please, enter a command:");
    }

    private void add(int amount) {
        this.firstContainer.add(amount);
        System.out.println("First : " + firstContainer);
        System.out.println("Second : " + secondContainer);
    }

    private void move(int amount) {
        int totalAmount = firstContainer.getTotalAmount();
        int realAmount = Math.min(amount, totalAmount);
        firstContainer.remove(realAmount);
        secondContainer.add(realAmount);
    }

    private void remove(int amount) {
        this.secondContainer.remove(amount);
        System.out.println("First : " + firstContainer);
        System.out.println("Second : " + secondContainer);
    }
}