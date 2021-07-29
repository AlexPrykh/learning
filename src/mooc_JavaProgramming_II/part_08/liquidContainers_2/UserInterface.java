package mooc_JavaProgramming_II.part_08.liquidContainers_2;

import java.util.Scanner;

public class UserInterface {
    private Container firstContainer;
    private Container secondContainer;
    private Scanner sc;

    public UserInterface(Container firstContainer, Container secondContainer, Scanner sc) {
        this.firstContainer = firstContainer;
        this.secondContainer = secondContainer;
        this.sc = sc;
    }

    public void start() {
        printCommandsList();
        System.out.println();
        printContainersOccupancy();
        System.out.println();
        System.out.println("Please, enter a command:");

        while (true) {
            String input = sc.nextLine();
            if ("quit".equals(input)) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.parseInt(parts[1]);

            processCommand(command, amount);
        }
        printContainersOccupancy();
    }

    private void printCommandsList() {
        System.out.println("Commands: "
                + "\nadd - adds liquid to the first flask"
                + "\nmove - moves liquid to the second flask"
                + "\nremove - removes liquid from the second flask"
                + "\nquit - exit the program");
    }

    private void printContainersOccupancy() {
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

    private void add(int amount) {
        this.firstContainer.add(amount);
        printContainersOccupancy();
    }

    private void move(int amount) {
        if ((this.firstContainer.contains() - amount) >= 0) {
            this.firstContainer.remove(amount);
            this.secondContainer.add(amount);
            printContainersOccupancy();
        } else {
            this.firstContainer.remove(this.firstContainer.contains());
            this.secondContainer.add(this.firstContainer.contains());
            printContainersOccupancy();
        }
    }

    private void remove(int amount) {
        this.secondContainer.remove(amount);
        printContainersOccupancy();
    }
}
