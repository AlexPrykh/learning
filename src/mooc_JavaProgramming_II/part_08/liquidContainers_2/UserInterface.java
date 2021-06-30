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
        System.out.println("Commands: "
                + "\nadd - adds liquid to the first flask"
                + "\nmove - moves liquid to the second flask"
                + "\nremove - removes liquid from the second flask"
                + "\nquit - exit the program");
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

            if ("add".equals(command)) {
                this.firstContainer.add(amount);
                System.out.println("First : " + firstContainer);
                System.out.println("Second : " + secondContainer);
            } else if ("move".equals(command)) {
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
            } else if ("remove".equals(command)) {
                this.secondContainer.remove(amount);
                System.out.println("First : " + firstContainer);
                System.out.println("Second : " + secondContainer);
            }
        }
        System.out.println("First : " + firstContainer);
        System.out.println("Second : " + secondContainer);
    }
}
