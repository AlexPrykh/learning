package exercise3.liquidContainers_2;

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
        System.out.println("Commands:");
        System.out.println("- add 'amount' - adds the amount of liquid to the first container");
        System.out.println("- move 'amount' - moves the amount of liquid to the second container");
        System.out.println("- remove 'amount' - removes the amount of liquid in the second container");
        System.out.println();
        System.out.println("Please, enter a command:");

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.parseInt(parts[1]);

            if (command.equals("add")) {
                this.firstContainer.add(amount);
                System.out.println("First : " + firstContainer);
                System.out.println("Second : " + secondContainer);
            } else if (command.equals("move")) {
                if ((this.firstContainer.contains() - amount) >= 0) {
                    this.firstContainer.remove(amount);
                    this.secondContainer.add(amount);
                    System.out.println("First : " + firstContainer);
                    System.out.println("Second : " + secondContainer);
                } else {
                    this.firstContainer.remove(this.firstContainer.contains());
                    this.secondContainer.add(this.firstContainer.contains());
                    System.out.println("First : " + firstContainer);
                    System.out.println("Second : " + secondContainer);
                }
            } else if (command.equals("remove")) {
                this.secondContainer.remove(amount);
                System.out.println("First : " + firstContainer);
                System.out.println("Second : " + secondContainer);
            }
        }
        System.out.println("First : " + firstContainer);
        System.out.println("Second : " + secondContainer);
    }
}