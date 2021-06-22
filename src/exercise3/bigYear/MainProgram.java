package exercise3.bigYear;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BirdRegister birdRegister = new BirdRegister();

        UserInterface userInterface = new UserInterface(sc, birdRegister);
        userInterface.start();
    }
}
