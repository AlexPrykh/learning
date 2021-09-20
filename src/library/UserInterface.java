package library;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Objects;
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

            if (input.isEmpty()) {
                continue;
            }

            if ("add".equalsIgnoreCase(input)) {
                add();
            }

            if ("remove".equalsIgnoreCase(input)) {
                System.out.println("Which deletion option do you want to use? +" +
                        "\n- isbn - this option is to deleting the book by isbn;" +
                        "\n- index - this option is to deleting the book by index.");
                String isbn = scanner.nextLine();
                if (isbn.isEmpty()) {
                    System.err.println("Error! Incorrectly entered data!");
                }
                if ("isbn".equalsIgnoreCase(isbn)) {
                }
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

    private void add() {
        while (true) {
            System.out.println("Please, enter a name book: ");
            String nameBook = scanner.nextLine();
            if (nameBook.isEmpty()) {
                System.err.println("Book title cannot be empty!");
                continue;
            }

            System.out.println("Please, enter a year of publication:");
            int yearOfPublication = Integer.parseInt(scanner.nextLine());
            if (yearOfPublication <= 0) {
                System.err.println("The year of publication cannot be negative!");
                continue;
            }

            System.out.println("Please, enter a author name:");
            String authorName = scanner.nextLine();
            if (authorName.isEmpty()) {
                System.err.println("Author name cannot be empty!");
                continue;
            }

            System.out.println("Please, enter a ISBN (identifier serial book number):");
            int isbn = Integer.parseInt(scanner.nextLine());
            if (isbn <= 0) {
                System.err.println("identifier serial book number cannot be 0 or negative!");
                continue;
            }

            books.add(new Book(nameBook, yearOfPublication, authorName, isbn));
        }
    }
}

