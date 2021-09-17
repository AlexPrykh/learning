package library;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private ArrayList<Book> books;
    private Scanner scanner;
    private FileInputStream inputStream;
    private FileOutputStream outputStream;

    public UserInterface(ArrayList<Book> books, Scanner scanner,
                         FileInputStream inputStream, FileOutputStream outputStream) {
        this.books = new ArrayList<>();
        this.scanner = scanner;
        this.inputStream = inputStream;
        this.outputStream = outputStream;
    }

    public void start() {
        System.out.println("Welcome to our library!");
        printStartInfo();

        while (true) {
            // read user input
            String input = scanner.nextLine();

            if ("quit".equalsIgnoreCase(input)) {
                break;
            }

            if(input.isEmpty()) {
                continue;
            }

            if ("add".equalsIgnoreCase(input)){
                // method
            }

            if ("remove".equalsIgnoreCase(input)) {
                // method
            }

            if ("search".equalsIgnoreCase(input)) {
                // method
            }
        }
    }

    private void printStartInfo() {
        System.out.println("Use these commands to manipulate the library:" +
                "\n- add - using this command you can add a book to the library;" +
                "\n- remove - using this command you can delete a book the library;" +
                "\n- search - using this command you can search a book the library.");
    }
}

