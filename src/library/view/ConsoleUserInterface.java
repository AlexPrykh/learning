package library.view;

import library.controller.FileBasedLibrary;
import library.model.Book;

import java.util.List;
import java.util.Scanner;

public class ConsoleUserInterface {
    // MVC - model, view, controller
    private Scanner scanner = new Scanner(System.in);
    private FileBasedLibrary library;

    public ConsoleUserInterface(FileBasedLibrary library) {
        this.library = library;
    }

    public void start() {
        System.out.println("Welcome to our library!");
        printStartInfo();

        while (true) {
            // read user input
            String input = scanner.nextLine();

            if ("load".equalsIgnoreCase(input)) {
                // todo read fileName from console
                // library.setFileName(...)
                String read = scanner.nextLine();
                if (read.trim().isEmpty() || read.isEmpty()) {
                    System.err.println("Error! Invalid file name");
                }
                library.setFileName(read);
            }

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
                remove();
            }

            if ("search".equalsIgnoreCase(input)) {
                search();
            }
        }
    }

    private void search() {
        String bookName = getBookName(Boolean.TRUE);
        Integer publicationYear = getPublicationYear(Boolean.FALSE);
        String authorName = getAuthorName(Boolean.TRUE);
        Long isbn = getIsbn(Boolean.FALSE);

        List<Book> books = library.searchBooks(bookName, publicationYear, authorName, isbn);
        for (int i = 0; i < books.size(); i++) {
            System.out.printf("#%d: %s\n", i + 1, books.get(i));
        }
    }

    // finish deleting by index
    private void remove() {
        // how do you want to remove at this book - by index or by isbn?
        System.out.println("How do you want to remove at this book - by index or by isbn?");
        System.out.println("Enter the command:\n" +
                "- index - deletes the book by the selected index;\n" +
                "- isbn - will delete the book by ISBN (identifier serial book number).");
//        int deleteByIndex = Integer.parseInt(scanner.nextLine());
//        while (deleteByIndex <= 0) {
//            System.err.println("Error! Invalid data entered!");
//            if (deleteByIndex > 0) {
//               if (deleteByIndex >) проверка, не больше ли индекс за количество книг?
//                boolean result = library.removeBook(deleteByIndex);
//                if (result) {
//                    System.out.println("Book removed.");
//                } else {
//                    System.out.println("Unable to delete book or book is missing!.");
//                }
//            }
//        }

        deleteByIsbn();
    }

    private void deleteByIsbn() {
        String deleteByIsbn = scanner.nextLine();
        while (!"isbn".equalsIgnoreCase(deleteByIsbn)) {
            if (deleteByIsbn.trim().isEmpty() || deleteByIsbn.isEmpty()) {
                System.err.println("Error! Invalid data entered!");
            }
            if ("isbn".equalsIgnoreCase(deleteByIsbn)) {
                long isbn = getIsbn(Boolean.FALSE);
                boolean result = library.removeBook(isbn);
                if (result) {
                    System.out.println("Book removed.");
                } else {
                    System.out.println("Unable to delete book or book is missing!.");
                }
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
        String bookName = getBookName(Boolean.FALSE);
        int publicationYear = getPublicationYear(Boolean.FALSE);
        String authorName = getAuthorName(Boolean.FALSE);
        long isbn = getIsbn(Boolean.FALSE);

        boolean result = library.addBook(bookName, publicationYear, authorName, isbn);
        if (result) {
            System.out.println("Book added.");
        } else {
            System.out.println("Failed to add book! Try again!");
        }
    }

    private Long getIsbn(boolean emptyAllowed) {
        Long isbn = null;
        while (isbn == null || isbn <= 0) {
            System.out.println("Please, enter a ISBN (identifier serial book number):");
            isbn = Long.parseLong(scanner.nextLine());
            if (isbn <= 0 && !emptyAllowed) {
                System.err.println("identifier serial book number cannot be 0 or negative!");
            }
            if (isbn == 0 && emptyAllowed) {
                return null;
            }
        }
        return isbn;
    }

    private String getAuthorName(boolean emptyAllowed) {
        String authorName = null;
        while (authorName == null || authorName.trim().isEmpty()) {
            System.out.println("Please, enter a author name:");
            authorName = scanner.nextLine();
            if (authorName.isEmpty() && !emptyAllowed) {
                System.err.println("Author name cannot be empty!");
            }
            if (authorName.trim().isEmpty() && emptyAllowed) {
                return null;
            }
        }
        return authorName;
    }

    private Integer getPublicationYear(boolean emptyAllowed) {
        Integer publicationYear = null;
        while (publicationYear == null || publicationYear <= 0) {
            System.out.println("Please, enter a year of publication:");
            publicationYear = Integer.parseInt(scanner.nextLine());
            if (publicationYear <= 0 && !emptyAllowed) {
                System.err.println("The year of publication cannot be negative!");
            }
            if (publicationYear == 0 && emptyAllowed) {
                return null;
            }
        }
        return publicationYear;
    }

    private String getBookName(boolean emptyAllowed) {
        String bookName = null;
        while (bookName == null || bookName.trim().isEmpty()) {
            System.out.println("Please, enter a name book: ");
            bookName = scanner.nextLine();
            if (bookName.isEmpty() && !emptyAllowed) {
                System.err.println("Book title cannot be empty!");
            }
            if (bookName.trim().isEmpty() && emptyAllowed) {
                return null;
            }
        }
        return bookName;
    }
}