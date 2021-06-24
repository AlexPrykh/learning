package mooc_JavaProgramming_I.exercise3.bigYear;

import java.util.Scanner;

public class UserInterface {
    private Scanner sc;
    private BirdRegister register;

    public UserInterface(Scanner sc, BirdRegister register) {
        this.sc = sc;
        this.register = register;
    }

    public void start() {
        System.out.println("Commands:");
        System.out.println("Add - adds a bird");
        System.out.println("Observation - adds observation");
        System.out.println("All - printing all birds");
        System.out.println("One - printing one bird");
        System.out.println("Quit - ends the program");

        while (true) {
            System.out.println("Please, enter  a command:");
            String input = sc.nextLine();

            if ("Add".equalsIgnoreCase(input)) {
                add();
            }

            if ("Observation".equalsIgnoreCase(input)) {
                observation();
            }

            if ("All".equalsIgnoreCase(input)) {
                printAllBirds();
            }

            if ("One".equalsIgnoreCase(input)) {
                printOneBird();
            }

            if ("Quit".equalsIgnoreCase(input)) {
                break;
            }
        }
    }

    public void add() {
        System.out.println("Please, enter a bird name:");
        String name = sc.nextLine();
        System.out.println("PLease, enter a Latin name:");
        String latinName = sc.nextLine();
        register.add(name, latinName);
    }

    public void observation() {
        System.out.println("What bird will be watched?");
        String search = sc.nextLine();
        int count = 0;
        for (Bird bird : register.getRegister()) {
            if (search.equals(bird.getName())) {
                bird.increaseObservationCount();
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Not a bird!");
        }
    }

    public void printAllBirds() {
        for (Bird bird : register.getRegister()) {
            System.out.println(bird);
        }
    }

    public void printOneBird() {
        System.out.println("What kind of bird are you looking for?");
        String search = sc.nextLine();
        for (Bird bird : register.getRegister()) {
            if (search.equals(bird.getName())) {
                System.out.println(bird);
            }
        }
    }
}
